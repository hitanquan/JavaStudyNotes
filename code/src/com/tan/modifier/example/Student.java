package com.tan.modifier.example;

/**
 * @ClassName: Student
 * @Description: 学生类
 * @Author: TanQuan
 * @Date: 2021/5/22 12:58
 * @Version: 1.0
 */
public class Student extends People {
    @Override
    protected void eat() {
        System.out.println("学生一般到食堂吃饭……");
    }

    public static void main(String[] args) {
        new Student().eat();
        // 当子父类在同一包下，子类可以访问父类中 protected 修饰的成员，不在同一包下则不能访问
        People p = new People();
        System.out.println(p.age);
        p.eat();
    }
}
