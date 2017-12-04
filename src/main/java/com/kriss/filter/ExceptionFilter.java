package com.kriss.filter;

import com.kriss.exceptions.BizException;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ExceptionFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response  = (HttpServletResponse)servletResponse;
        servletRequest.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf8");
        try{
            filterChain.doFilter(servletRequest,servletResponse);
        }catch(Exception e){
            if(e instanceof BizException){
                BizException  be  = (BizException)e;
                if("10002".equals(be.getExcetionCode())){
                    response.sendRedirect("/login/x.jsp?status=nolog");
                    return;
                }else if("10001".equals(be.getExcetionCode())){
                    response.getWriter().write("参数缺失");
                    return;
                }
            }
            servletResponse.getWriter().write("服务器忙，请稍后再试");
        }
    }

    public void destroy() {

    }
}
