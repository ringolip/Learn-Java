package ringo.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/7 19:43
 */
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        String username = servletContext.getInitParameter("username");
        System.out.println(servletContext);
        System.out.println("context-param参数的值是" + username);
        System.out.println("当前的工程路径：" + servletContext.getContextPath());
        System.out.println("工程部署后在服务器磁盘上的真实路径" + servletContext.getRealPath("/"));
        System.out.println("css/demo.css工程部署后在服务器磁盘上的真实路径" + servletContext.getRealPath("/css/demo.css"));
        System.out.println("Context中获取域数据的key1值是" + servletContext.getAttribute("key1"));

    }
}
