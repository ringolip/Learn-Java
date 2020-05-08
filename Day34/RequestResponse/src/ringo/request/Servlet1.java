package ringo.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/8 12:56
 */
public class Servlet1 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 请求转发
        // 获取请求参数
        System.out.println("请求参数在Servlet1" + req.getParameter("name"));
        // 设置域数据
        req.setAttribute("where", "servlet1");

        // 获取请求转发对象
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/s2");

        // 转发请求到另一资源
        System.out.println("Servlet1转发请求");
        requestDispatcher.forward(req, resp);

    }
}
