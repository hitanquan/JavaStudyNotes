package com.tan.annotation;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 自定义注解的使用
 * @date 2021-4-9 12:23
 * @author 木佑君
 */
public class Student {
    @MyAnnotation(name = "lisi", age = 22)
    public void add(String name, int age) {
        System.out.println("name="+name+",age="+age);
    }

    public void delete() {
    }

    // 通过反射将注解信息注入到add()方法中
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Student> sClass = Student.class;
        Method method = sClass.getMethod("add", String.class, int.class);
        System.out.println(method);

        MyAnnotation anno = method.getAnnotation(MyAnnotation.class);
        String name = anno.name();
        int age = anno.age();
        // System.out.println(anno.name());

        Student instance = sClass.newInstance();
        method.invoke(instance, name, age);

        // Method m = sClass.getMethod("delete");

        // new Student().add("王五", 30);
    }
}
