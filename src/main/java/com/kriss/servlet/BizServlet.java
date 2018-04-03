package com.kriss.servlet;

import com.kriss.cms.mybatis.dto.CmsUsers;
import com.kriss.cms.mybatis.dto.CrmRegiste;
import com.kriss.cms.service.BizService;
import com.kriss.cms.service.UserService;
import com.kriss.exceptions.BizException;
import com.kriss.util.DateUtil;
import com.kriss.util.HttpUtil;
import com.kriss.util.Pager;
import com.kriss.util.StringUtil;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

           String callback = req.getParameter("callback");
           if(callback!=null&&callback.length()>0){
               resp.getWriter().write(callback+"({\"status\":\"10000\",\"msg\":\"保存成功\"})");
           }else
               resp.getWriter().write("{\"status\":\"10000\",\"msg\":\"保存成功\"}");
       }else if("regList".equals(m)){   String pageNo  = req.getParameter("pageNo");
           Pager pager  = new Pager();
           pager.setPage(Integer.parseInt(pageNo==null?"1":pageNo));
           bizService.listRegs(pager);
           req.setAttribute("pager",pager);
           req.getRequestDispatcher("/root/reg_list.jsp").forward(req,resp);
       } else if("carRegList".equals(m)){
           String pageNo  = req.getParameter("pageNo");
           Pager pager  = new Pager();
           pager.setPage(Integer.parseInt(pageNo==null?"1":pageNo));
           bizService.listCarRegs(pager);
           req.setAttribute("pager",pager);
           req.getRequestDispatcher("/root/car_reg_list.jsp").forward(req,resp);
       } else if("export".equals(m)){
           Map condition  = new HashMap();
           List data  = bizService.listRegsByMap(condition);
           String appPath   = this.getServletContext().getRealPath("/");
           try{
               InputStream is = new FileInputStream(appPath+"/root/regTemps.xlsx");
               OutputStream os = new FileOutputStream(appPath+"/root/object_collection_output.xlsx");
               Context context = new Context();
               context.putVar("regs", data);
               JxlsHelper.getInstance().processTemplate(is, os, context);
               is.close();
               os.flush();
               os.close();
               download(appPath+"/root/object_collection_output.xlsx",resp);
           }catch (Exception e){
               e.printStackTrace();
           }
       }
    }

    private void download(String fileName,HttpServletResponse response){
        response.setContentType("application/download");
        try {
            String attachName  = java.net.URLEncoder.encode("报名数据","UTF-8");

            response.setHeader("Content-Disposition", "attachment;filename="+attachName+"_"+ DateUtil.getDateString(new Date(),"yyyyMMddHHmm")+".xlsx");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        FileInputStream  fis  = null;
        try {
              fis  = new FileInputStream(fileName);
            byte datas[] = new byte[1024];
            int readed  = 0;
            while((readed =  fis.read(datas))>0){
                response.getOutputStream().write(datas,0,readed);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
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
