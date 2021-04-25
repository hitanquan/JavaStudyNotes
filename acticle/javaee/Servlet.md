# Servlet

### 1.什么是Servlet？

它是sun公司定义的13种JavaEE技术规范之一，本质上还是一个Java类，只不过它运行在服务器端，由服务器（一般指Tomcat）自动通过反射技术来调用其内部方法，不同于我们平常写的运行在本地JVM中的Java类，它是将编译好的字节码放到服务器上运行的。

### 2.它有什么作用？举例说明

2.1 它主要的作用就是能够处理浏览器带来HTTP请求，并返回一个响应给浏览器，从而实现浏览器和服务器的交互。

2.2 xxxxxxxx

### 3.创建Servlet的三种方式：

    1.实现Servlet接口.
    2.继承GenericServlet类.
    3.继承HttpServlet类.
    
最常用的是第三种方式。

### 4.Servlet的生命周期    
    当tomcat启动后，第一次访问servlet时，servlet对象创建，之后调用init()初始化方法进行属性初始化，之后doGet()或doPost()方法被调用，用于
    处理浏览器请求，当tomcat停止后，destory()方法被调用。整个过程中，init()方法和destory()方法只被调用一次，而处理请求的doGet()或doPost()方法每
    请求一次就调用一次。

### 5.参考学习教程：

[1.菜鸟教程](https://www.runoob.com/servlet/servlet-tutorial.html)



