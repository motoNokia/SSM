package com.ly.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter  implements Filter{
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        String requestUrl = httpServletRequest.getRequestURI();
        String context = httpServletRequest.getContextPath();
        if (requestUrl.equals("/ssm/")){
            httpServletResponse.sendRedirect(context+"/index");
            return;
        }
        chain.doFilter(request,response);
        return;
    }

    public void destroy() {

    }
}
