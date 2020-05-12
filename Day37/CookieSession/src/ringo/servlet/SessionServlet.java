package ringo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/12 09:27
 */
public class SessionServlet extends BaseServlet{
    protected void getSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 创建session会话
        HttpSession session = req.getSession();
        resp.getWriter().write("session：" + session + "<br/>");
        // 判断session是否是新创建的
        boolean isNew = session.isNew();
        resp.getWriter().write("session是否是新创建的" + isNew + "<br/>");
        // 获取session的id
        String sessionId = session.getId();
        resp.getWriter().write("sessionID：" + sessionId + "<br/>");

    }

    protected void setAttribute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("key1", "value1");
        response.getWriter().write("session域数据已存储");

    }

    protected void getAttribute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object key1 = session.getAttribute("key1");
        response.getWriter().write("session域数据value1的值为：" + key1);
    }

    protected void sessionDefaultTimeout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int timeout = session.getMaxInactiveInterval();
        response.getWriter().write("session超时时间为：" + timeout);
    }

    protected void setSessionTimeout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(3);
        int sessionTimeout = session.getMaxInactiveInterval();
        response.getWriter().write("session超时时间为：" + sessionTimeout);
    }

    protected void setInvalidate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        int sessionTimeout = session.getMaxInactiveInterval();
        response.getWriter().write("session已设置为无效");
    }
}
