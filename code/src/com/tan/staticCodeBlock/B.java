package com.tan.staticCodeBlock;

/**
 * @ClassName: B
 * @Description:
 * @Author: TanQuan
 * @Date: 2021/5/22 13:25
 * @Version: 1.0
 */
public class B extends A {
    static {
        System.out.println("a");
    }

    public B() {
        System.out.println("b");
    }
}
