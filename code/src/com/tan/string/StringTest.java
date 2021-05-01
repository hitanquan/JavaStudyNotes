package com.tan.string;

/**
 * @ClassName: String
 * @Description: String类的使用
 * @Author: TanQuan
 * @Date: 2021/5/1 14:07
 * @Version: 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        //String实例化两种方式
        //方式1：直接赋值
        String str1 = "Hello,World";
        System.out.println("str1："+str1);
        //方式2：使用new关键词
        String str2 = new String("Hello,World");
        System.out.println("str2："+str2);

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
