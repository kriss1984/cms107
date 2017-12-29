package com.kriss.servlet;

import com.kriss.cms.mybatis.dto.CmsUsers;
import com.kriss.cms.mybatis.dto.CrmRegiste;
import com.kriss.cms.service.BizService;
import com.kriss.cms.service.UserService;
import com.kriss.exceptions.BizException;
import com.kriss.util.HttpUtil;
import com.kriss.util.Pager;
import com.kriss.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class BizServlet extends HttpServlet {

    BizService bizService  = new BizService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String m  = req.getParameter("m");
       if("reg".equals(m)){//报名用户
           String name  = req.getParameter("regName");
           String phone  = req.getParameter("regPhone");
           if(StringUtil.isEmpty(name)||StringUtil.isEmpty(phone))
               throw new BizException("10001","参数丢失!");
           CrmRegiste  crmRegiste = new CrmRegiste(name,phone);
           crmRegiste.setJiadian( req.getParameter("jiadian"));
           crmRegiste.setJiancai( req.getParameter("jiancai"));
           crmRegiste.setZhuangxiugs(req.getParameter("zhuangxiugs"));
           crmRegiste.setJiaquanjc( req.getParameter("jiaquanjc"));
           crmRegiste.setReqIp(HttpUtil.getIpAddress(req));
           crmRegiste.setRegTime(new Date());
           crmRegiste.setRegSource(alalySource(req));
           bizService.saveReg(crmRegiste);
           resp.getWriter().write("{\"status\":\"10000\",\"msg\":\"保存成功\"}");
       }else if("regList".equals(m)){   String pageNo  = req.getParameter("pageNo");
           Pager pager  = new Pager();
           pager.setPage(Integer.parseInt(pageNo==null?"1":pageNo));
           bizService.listRegs(pager);
           req.setAttribute("pager",pager);
           req.getRequestDispatcher("/root/reg_list.jsp").forward(req,resp);
       }
    }

    private String alalySource(HttpServletRequest request){
        String userAgent = request.getHeader("user-agent").toLowerCase();
        if(userAgent.indexOf("micromessenger")>-1){//微信客户端
            return "微信";
        }else{
           return "浏览器";
        }
    }
}
