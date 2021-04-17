## 工厂模式

#### 1.什么是工厂模式？

工厂模式，即创建对象的工厂


#### 2.有什么作用？举例说明

```
interface Fruit {
    public void squeeze();
}

class Apple implements Fruit {
    public void squeeze() {
 	    System.out.println("榨出一杯苹果汁儿");
    }
}

class Factory {
    public static Fruit getInstance(String className) {
 	    if ("apple".equals(className)) {
 		    return new Apple();
 	    }
 	    return null;
    }
}

public class Demo01 {
    public static void main(String[] args) {
 	    Fruit f = Factory.getInstance("apple");
 	    f.squeeze();
    }
}
```