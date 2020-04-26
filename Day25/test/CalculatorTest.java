package ringo.day25.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ringo.day25.junit.Calculator;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 17:15
 */
public class CalculatorTest {

    @Before
    public void init() {
        System.out.println("start...");
    }

    @After
    public void close() {
        System.out.println("close...");
    }


    @Test
    public void testadd() {
//        System.out.println("我被执行了");
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        System.out.println("test...");
//        System.out.println(result);
        Assert.assertEquals(3, result);
    }
}
