package ringo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/11 19:49
 */
public class CookieSetServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置Cookie
        String username = req.getParameter("username");
        String password = req.getParameter("pwd");
        System.out.println(username);

        // 判断用户名密码
        if ("lilneng".equals(username) && "123456".equals(password)) {
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(60*60*24*7); // 设置cookie生命周期
            resp.addCookie(cookie);
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
