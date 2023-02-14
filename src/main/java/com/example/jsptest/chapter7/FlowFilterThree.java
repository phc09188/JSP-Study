package com.example.jsptest.chapter7;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "timer", urlPatterns = "/third")
public class FlowFilterThree implements Filter {
    public void init(FilterConfig config) {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        long startTime = System.currentTimeMillis();
        chain.doFilter(request, response);
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        System.out.println("수행 시간 : " + executeTime + "ms");
    }
}
