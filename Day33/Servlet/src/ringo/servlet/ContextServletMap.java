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
 * @date 2020/5/7 20:32
 */
public class ContextServletMap extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        System.out.println(servletContext);
        servletContext.setAttribute("key1", "value1");

        System.out.println("Context中获取域数据的key1值是" + servletContext.getAttribute("key1"));
    }
}












