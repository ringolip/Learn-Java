package ringo.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/7 15:13
 */
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化方法");
        System.out.println("Servlet的别名" + servletConfig.getServletName());
        System.out.println("初始化参数" + servletConfig.getInitParameter("username"));
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 允许servlet响应某个请求
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello,World!");

        // 类型转换
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)) {
            doGet();
        } else if ("POST".equals(method)) {
            doPost();
        }

    }

    public void doGet() {
        System.out.println("get请求");
        System.out.println("get请求");
    }

    public void doPost() {
        System.out.println("post请求");
        System.out.println("post请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
