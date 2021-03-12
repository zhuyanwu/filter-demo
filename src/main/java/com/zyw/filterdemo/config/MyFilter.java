package com.zyw.filterdemo.config;

import com.zyw.filterdemo.controller.CompanyController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
@WebFilter(filterName = "myFilter",urlPatterns = "/*")
public class MyFilter implements Filter {

    @Autowired
    private CompanyController companyController;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        log.info("doFilter...");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        log.info("destroy...");
    }
}
