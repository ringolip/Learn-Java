package ringo.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/11 14:19
 */
public class DownloadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = "a.jpg";

        ServletContext servletContext = getServletContext();
        // 获取资源的MIME类型
        String mimeType = servletContext.getMimeType("/file/" + fileName);
        System.out.println(mimeType);
        // 通过响应头告诉客户端返回的数据类型
        resp.setContentType(mimeType);

        // 告诉客户端返回数据用于下载
        resp.setHeader("Content-Disposition", "attachment; filename="
                + URLEncoder.encode("马大哈.jpg", "UTF-8")); // 把中文名进行UTF-8编码
        // 获取资源的输入流
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + fileName);
        // 创建响应的输出流对象
        ServletOutputStream outputStream = resp.getOutputStream();

        // 将输入流中的内容拷贝给输出流并返回给客户端
        IOUtils.copy(resourceAsStream, outputStream);
    }
}
