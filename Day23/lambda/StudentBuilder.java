package ringo.day23.lambda;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/24 15:12
 */

@FunctionalInterface
public interface StudentBuilder {
    Student build(String name,int age);

}
