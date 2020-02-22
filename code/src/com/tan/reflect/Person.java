package com.tan.reflect;

/**
 * Person实体类，用来辅助反射代码练习
 * @author 谭少，公众号：谭少学Java
 * @date 2020年2月19日 12点09分
 */
public class Person {
    public String name;
    public Integer age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private void test(){
        System.out.println("供测试获取私有方法使用");
    }
}
