package ringo.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/8 15:35
 */
public class ServletResponse extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding("UTF-8");
////        resp.setContentType("text/html; charset=UTF-8");
////        PrintWriter writer = resp.getWriter();
////        System.out.println(resp.getCharacterEncoding()); // 默认字符集ISO-8859-1
////        writer.write("一个简单的响应");

        System.out.println("重定向之前在ServletResponse中");
//        resp.setStatus(302);
//        resp.setHeader("Location", "http://localhost:8080/rr/new");
        resp.sendRedirect("http://localhost:8080/rr/new");
    }
}
