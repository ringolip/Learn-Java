package ringo.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/8 13:00
 */
public class Servlet2 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("请求参数在Servlet2" + req.getParameter("name"));

        System.out.println("获取Servlet1的域数据" + req.getAttribute("where"));

        System.out.println("这里是Servlet2");

    }
}
