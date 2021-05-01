# String类的使用及内存原理

### 1.String类的使用

- 1.1 String实例化的两种方式：

    - 方式1：直接赋值：
      
        ```java
        String str1 = "Hello,World";
        ```

    -  方式2：通过new关键字，调用构造函数实例化：

      ```java
      String str1 = new String("Hello,World");
      ```

    直接赋值和通过构造函数实例化`String`对象的主要区别在于存储的区域不同，直接赋值存储在字符串常量池中，通过构造函数实例化，存储在堆内存中。

    当我们分别使用`==`号和`equals()`方法比较`str1`和`str2`的时候会得到如下结果：

    ```java
    System.out.println(str1 == str2); //false
    System.out.println(str1.equals(str2)); //true
    ```

    因为`==`号对基本数据类型比较的是数据值，对引用数据类型比较的是引用的内存地址，`equals()`方法比较的则是两个对象的数据值，而`String`是引用数据类型。

- 1.2 String类的特性：



- 1.3 常见面试题：