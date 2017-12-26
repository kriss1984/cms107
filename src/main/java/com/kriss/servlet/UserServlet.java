package com.kriss.servlet;

import com.kriss.cms.mybatis.dto.CmsUsers;
import com.kriss.cms.service.UserService;
import com.kriss.exceptions.BizException;
import com.kriss.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    UserService userService  = new UserService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String m  = req.getParameter("m");
       if("login".equals(m)){
           String logName  = req.getParameter("logName");
           String logPasswd  = req.getParameter("logPasswd");
           if(StringUtil.isEmpty(logName)||StringUtil.isEmpty(logPasswd))
               throw new BizException("10001","参数丢失!");
           CmsUsers cmsUsers  = new CmsUsers();
           cmsUsers.setLogName(logName);
           cmsUsers.setLogPasswd(logPasswd);
           CmsUsers  logResult  = userService.login(cmsUsers);
           if(logResult!=null){
               req.getSession().setAttribute("currentUser",logResult);
               resp.sendRedirect("/root/home.jsp");
           }else{
               resp.sendRedirect("/login/x.jsp?status=logFailed");
           }
       }else if("logout".equals(m)){
           req.getSession().invalidate();
           resp.sendRedirect("/login/x.jsp");
       }
       else if("test".equals(m)){
           System.out.println( req.getParameter("name"));
           System.out.println( req.getParameter("phone"));
       }
    }

}
