package ringo.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/12 13:26
 */

public class AdminFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 过滤方法
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 获取session
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession();

        // 查看session中是否有指定的域信息
        Object user = session.getAttribute("user");

        if (user == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            // 让用户进行之前的操作
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
