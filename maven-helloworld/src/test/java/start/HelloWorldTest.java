package start;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * <p>Description:</p>
 *
 * @author snowball
 * @version v1.0
 * @date 2023/3/3 21:47 | 星期五
 **/
public class HelloWorldTest {
    @Test
    public void testSayHello() {

        String sayHello = new HelloWorld().sayHello();

        Assert.assertEquals("hello maven!", sayHello);
    }
}
