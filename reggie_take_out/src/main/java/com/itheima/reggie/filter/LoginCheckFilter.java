package com.itheima.reggie.filter;

import com.alibaba.fastjson.JSON;
import com.itheima.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.remoting.rmi.RmiClientInterceptorUtils;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//检查用户是否登陆
@WebFilter(filterName = "LoginCheckFilter",urlPatterns = "/*")
@Slf4j
@ServletComponentScan
public class LoginCheckFilter implements Filter {

    //路径匹配，支持通配符
    public static final AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        /*
          不是每次请求都需要处理
          已登陆则可以直接放行
          未登录则拦截
         */

        String requestURI=request.getRequestURI();
        log.info("拦截到:{}",requestURI);
        String[] urls= new String[]{
                "/employee/login","/employee/logout","backend/**","front/**"
        };
        boolean check = Check(requestURI, urls);
        if(check){
            log.info("本次请求:{}不需要处理",requestURI);
            filterChain.doFilter(request,response );
            return;
        }

        if(request.getSession().getAttribute("employee") != null){
            log.info("用户已登录");
            filterChain.doFilter(request,response);
            return;
        }

        log.info("用户未登录");
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;

    }

    public boolean Check(String requestURI,String []urls){
        for (String url:urls){
        if(antPathMatcher.match(url,requestURI)){
            return true;
        }
        }return false;
    }
}
