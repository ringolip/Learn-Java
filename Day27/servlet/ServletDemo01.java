package ringo.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/28 12:16
 */
public class ServletDemo01 implements Servlet{
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello, Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
