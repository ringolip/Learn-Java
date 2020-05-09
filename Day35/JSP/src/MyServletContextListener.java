import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/5/9 21:29
 */
public class MyServletContextListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("MyServletContextListener对象被创建了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("MyServletContextListener被销毁了");
    }
}
