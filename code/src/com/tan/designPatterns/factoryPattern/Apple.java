package com.tan.designPatterns.factoryPattern;

public class Apple implements Fruit{
    @Override
    public void squeeze() {
        System.out.println("榨出一杯苹果汁……");
    }
}
