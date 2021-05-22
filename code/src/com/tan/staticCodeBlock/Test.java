package com.tan.staticCodeBlock;

/**
 * @ClassName: Test
 * @Description: 静态代码块测试
 * @Author: TanQuan
 * @Date: 2021/5/22 13:22
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        A ab = new B(); //输出结果：1  a  2  b
        ab = new B(); //输出结果：2  b

        // 结论：
        // 1.静态代码块的执行顺序 > 构造函数
        // 2.静态代码块只会执行一次
    }
}
