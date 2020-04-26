package ringo.day25.anno;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 19:09
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
//        - @Retention - 标识这个注解怎么保存，是只在代码中，还是编入class文件中，或者是在运行时可以通过反射访问。
//        - @Documented - 标记这些注解是否包含在用户文档中。
//        - @Target - 标记这个注解应该是哪种 Java 成员。
//        - @Inherited - 标记这个注解是继承于哪个注解类(默认 注解并没有继承于任何子类)

@Target(value = {ElementType.TYPE})
public @interface MyAnno01 {
}
