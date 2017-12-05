package com.kriss.filter;

import com.kriss.cms.service.ArticleService;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ArticleFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        HttpServletRequest  request = (HttpServletRequest)servletRequest;
       final  String uri = request.getRequestURI();
        filterChain.doFilter(request,servletResponse);
        new Thread(new Runnable() {
            public void run() {
                String link   = getLink(uri);
                ArticleService articleService = new ArticleService();
                articleService.updateClickCntByLink(link);
            }
        }).start();

    }

    private String getLink(String url){
        if(url==null||url.length()==0)
            return "";
        return url.substring(url.lastIndexOf("/")+1);
    }
    public void destroy() {

    }
}
