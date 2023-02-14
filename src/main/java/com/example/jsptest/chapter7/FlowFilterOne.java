package com.example.jsptest.chapter7;

import javax.servlet.*;
import java.io.IOException;

public class FlowFilterOne implements Filter {
    public void init(FilterConfig config)  {
        System.out.println("init 호출 ..... one");
    }

    public void destroy() {
        System.out.println("destroy 호출 ..... one");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter 호출 전 ....... one");
        chain.doFilter(request, response);
        System.out.println("doFilter 호출 후 ....... one");
    }
}
