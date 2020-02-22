# Java反射机制

### 1.什么是反射？

反射是指在程序运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个属性和方法；这种动态获取信息以及动态调用对象方法的功能称为java语言的反射机制.

### 2.反射有什么用？举例说明

- JDBC中读取配置文件(可查看撩课JDBC代码).
- Tomcat内部Servlet对象创建、方法调用原理：即通过反射获取web.xml配置文件中的Servlet全限定名称(<servlet-name>标签的值)，从而创建Servlet对象，调用Servlet中的方法(撩课07-web服务器阶段视频第32节详细讲解了该过程).
- Spring框架底层使用了反射机制.

### 3.怎么使用反射？

3.1 想要使用反射，就必须得要获取字节码文件，而.class文件有三种获取方式：
    
- Object类的getClass()方法.
- class 静态属性.    
- Class类中静态方法forName().

```
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
```



        
        
第1、3种方式好理解，就是第2种方式Person.class，Person类中也没有这个静态属性啊，所以它是哪里来的？难道跟第一种方式一样从Object类继承下来的？看了Object类源码发现它也没有这个静态属性啊。        

3.2 既然反射能够知道类的属性和方法，那就看看它是怎么操作的吧。

- 操作属性
        
        // 1.获取公有属性name
        Field name = pClass1.getField("name");
        System.out.println(name.getName());
    
        // 2.获取私有属性gender
        Field gender = pClass1.getDeclaredField("gender");
        // 需要获取访问权限
        gender.setAccessible(true);
        System.out.println(gender.getName());

- 操作方法    
    
        // 1.获取公有方法
        Method method = pClass2.getMethod("getAge");
        System.out.println(method.getName());

        // 2.获取私有方法
        Method method2 = pClass2.getMethod("test");
        method2.setAccessible(true);
        // 打印报异常：java.lang.NoSuchMethodException: com.tan.reflect.Person.test()
        System.out.println(method.getName());
        
疑问：为什么对私有属性和方法的获取不能通过getMethod()方法，要通过getDeclaredField()方法？        

[参考文章：来自Java3y公众号](https://mp.weixin.qq.com/s/535MXKKRe7u8ux8HAoCEAA)