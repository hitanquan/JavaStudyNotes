package com.tan.modifier.example;

/**
 * @ClassName: People
 * @Description:
 * @Author: TanQuan
 * @Date: 2021/5/22 12:56
 * @Version: 1.0
 */
public class People {
    private String id;
    private String name;
    protected int age;

    protected void eat() {
        System.out.println("人需要吃饭……");
    }
}
