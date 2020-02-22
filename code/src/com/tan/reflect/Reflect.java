package com.tan.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Java反射机制代码练习
 * @author 谭少，公众号：谭少学Java
 * @date 2020年2月19日 12点07分
 */
public class Reflect {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        // 获取字节码文件的三种方式
        // 1.Object类的getClass()方法
        Person P = new Person();
        Class<? extends Person> pClass1 = P.getClass();
        System.out.println(pClass1);

        // 2.class 静态属性
        Class<Person> pClass2 = Person.class;
        System.out.println(pClass2);

        // 3.Class类中静态方法forName()
        Class<?> pClass3 = Class.forName("com.tan.reflect.Person");
        System.out.println(pClass3);

        // =================================================
        // 注意这种方式和第1种方式的区别：打印的结果不一样
        Class<? extends Class> aClass1 = Person.class.getClass();
        System.out.println(aClass1);


        System.out.println("===============分割线===================");
        // 通过反射操作类的属性和方法
        // 1.获取公有属性name
        Field name = pClass1.getField("name");
        System.out.println(name.getName());

        // 2.获取私有属性gender
        Field gender = pClass1.getDeclaredField("gender");
        // 需要获取访问权限
        gender.setAccessible(true);
        System.out.println(gender.getName());

        // 3.获取公有方法
        Method method = pClass2.getMethod("getAge");
        System.out.println(method.getName());

        // 4.获取私有方法
        Method method2 = pClass2.getMethod("test");
        method2.setAccessible(true);
        System.out.println(method.getName());
    }
}
