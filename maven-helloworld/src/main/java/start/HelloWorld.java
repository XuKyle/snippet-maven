package start;

import com.google.common.collect.Lists;

/**
 * <p>Description:</p>
 *
 * @author snowball
 * @version v1.0
 * @date 2023/3/3 21:43 | 星期五
 **/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());

        for (Integer integer : Lists.newArrayList(1, 2, 3)) {
            System.out.println("integer = " + integer);
        }
    }

    public String sayHello() {
        return "hello maven!";
    }
}
