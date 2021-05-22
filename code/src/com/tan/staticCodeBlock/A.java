package com.tan.staticCodeBlock;

/**
 * @ClassName: A
 * @Description:
 * @Author: TanQuan
 * @Date: 2021/5/22 13:24
 * @Version: 1.0
 */
public class A {
    static {
        System.out.println("1");
    }

    public A() {
        System.out.println("2");
    }
}
