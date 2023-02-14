package com.example.jsptest.chapter7;

import javax.servlet.*;
import java.io.IOException;

public class FlowFilterTwo implements Filter {
    private String charset;
    public void init(FilterConfig config){
        System.out.println("init 호출 ..... two");
        charset = config.getInitParameter("en");
    }

    public void destroy() {
        System.out.println("destroy 호출 ..... two");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        request.setCharacterEncoding(charset);
        System.out.println("doFilter 호출 전 ....... two");
        chain.doFilter(request, response);
        System.out.println("doFilter 호출 후 ....... two");
    }
}
