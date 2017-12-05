package com.kriss.filter;

import com.kriss.cms.mybatis.dto.CmsUsers;
import com.kriss.exceptions.BizException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class SercurityFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        HttpServletRequest  request = (HttpServletRequest)servletRequest;
        String uri = request.getRequestURI();

        if(uri.endsWith("css")||uri.endsWith("js")||uri.endsWith("jpg")||uri.endsWith("png")||uri.endsWith("woff2")){
            filterChain.doFilter(request,servletResponse);
            return;
        }


        if(uri.endsWith("user")&&request.getQueryString()!=null&&(request.getQueryString().contains("login")||request.getQueryString().contains("logout"))){
            filterChain.doFilter(request,servletResponse);
            return;
        }



        CmsUsers  cmsUsers =  (CmsUsers)request.getSession().getAttribute("currentUser");
        if (cmsUsers==null){
            throw new BizException("10002","未登录");
        }else{
            filterChain.doFilter(request,servletResponse);
        }
    }

    public void destroy() {

    }
}
