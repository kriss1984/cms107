package com.kriss.servlet;

import com.kriss.cms.mybatis.dto.CarRegist;
import com.kriss.cms.mybatis.dto.CmsUsers;
import com.kriss.cms.service.CarService;
import com.kriss.cms.service.UserService;
import com.kriss.exceptions.BizException;
import com.kriss.jdbc.JDBCUtil;
import com.kriss.util.HttpUtil;
import com.kriss.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TempServlet extends HttpServlet {



    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String m  = req.getParameter("m");
       if("reg".equals(m)){
           String userName  =  (String)req.getParameter("userName");
           String phone  =  (String)req.getParameter("phone");
           String carType  =  (String)req.getParameter("carType");
           String zone  =  (String)req.getParameter("zone");
           CarRegist  carRegist  = new CarRegist(userName,phone,carType,zone, new Date(),HttpUtil.getIpAddress(req));
           CarService carService  = new CarService();
           carService.save(carRegist);
           resp.getWriter().write("ok");
       }

    }

}
