package ringo.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/11 16:35
 */
public class CookieServlet extends BaseServlet{
    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 创建Cookie对象
        Cookie cookie = new Cookie("key", "cookieDemo");
        // 通知客户端保存Cookie
        resp.addCookie(cookie);
        resp.getWriter().write("Cookie创建成功");


    }
    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie:cookies) {
            resp.getWriter().write(cookie.getName() + "---" + cookie.getValue() + "<br/>"); // 返回cookie的key和value
        }

    }
}
