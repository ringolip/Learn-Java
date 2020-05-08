package ringo.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/8 11:24
 */
public class ParameterServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("user"));
        System.out.println(req.getParameter("pwd"));
        String[] hobbies = req.getParameterValues("hobby");
        List<String> strings = Arrays.asList(hobbies);
        System.out.println(strings);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); // 重写请求体字符集
        System.out.println(req.getParameter( "user"));
        System.out.println(req.getParameter("pwd"));
        String[] hobbies = req.getParameterValues("hobby");
        List<String> strings = Arrays.asList(hobbies);
        System.out.println(strings);
    }

}
