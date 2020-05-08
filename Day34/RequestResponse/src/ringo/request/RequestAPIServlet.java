package ringo.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/8 10:45
 */
public class RequestAPIServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求的资源路径为：" + req.getRequestURI());
        System.out.println("请求的统一资源定位符为：" + req.getRequestURL());
        System.out.println("获取客户端ip地址：" + req.getRemoteHost());
        System.out.println(req.getHeader("User-Agent"));
    }
}
