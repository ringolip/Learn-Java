package ringo.day25.reflectconfig;

import java.lang.annotation.*;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 19:33
 */

// 将注解作用于类上，并且期望被保留在RUNTIME阶段
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {
    String className();
    String methodName();
}
