package com.tan.designPatterns.factoryPattern;

/**
 * 水果工厂
 * @date 2021-4-11 15:46
 * @author 木佑君
 */
public class FruitFactory {

    // 使用反射让水果工厂创建水果实例对象的代码更加简洁了
    public static Fruit getInstance(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName(className);
        Object instance = aClass.newInstance();
        return (Fruit) instance;
    }

    public static void main(String[] args) {
        try {
            Fruit instance = getInstance("com.tan.designPatterns.factoryPattern.Apple");
            System.out.println(instance);
            instance.squeeze();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
