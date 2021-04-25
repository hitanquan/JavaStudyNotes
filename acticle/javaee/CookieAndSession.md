# Cookie&Session会话跟踪技术

### 1.什么是会话？

简单来说，会话就是用户打开一个浏览器，做了一系列的事情，然后关闭浏览器，这个过程就称之为一个会话。

### 2.会话跟踪技术有什么用？举例说明。

2.1 保存各个客户端自己的数据：每个用户在使用浏览器与服务器进行会话的过程中，不可避免各自会产生一些数据，我们要想办法为每个用户保存这些数据，而Cooike和Session就能帮我们做到。

2.2 使用场景举例：

    1.登录中的“记住我”功能或“下次自动登录”功能.
    2.加入商品到购物车功能.

### 3.Cookie：

3.1 什么是Cookie?

Cookie是存储在客户端计算机上的文本文件，保留了各种跟踪信息，主要是将服务器发送过来的用户信息保存起来，以便于浏览器下次向服务器发起请求时，服务器知道是谁发来的请求，从而完成用户验证。

简单点说，Cookie就是由服务端创建，通过响应体传给并保存在客户端的可用于通过请求验证的数据凭证。

3.2 创建和读取Cookie

- 代码：

```java
@WebServlet("/cs")
public class CookieAndSessionServlet extends HelloServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //创建cookie对象
        Cookie cookie = new Cookie("name", "zhangsan");
        //添加到响应体
        response.addCookie(cookie);
        
        //读取客户端的cookie信息
        Cookie[] cookies = request.getCookies();
        for (Cookie ck : cookies) {
            System.out.println(ck.getName()+":"+ck.getValue());
        }
    }
}
```

- 浏览器控制台示例图：

![cookie](/Users/tanquan/后端/mycode/JavaStudyNotes/img/cookie.png)

3.3 生命周期

默认是只要关闭浏览器就销毁，我们通过 setMaxAge()
⽅法设置有效期，⼀旦设置了有效期，则不随浏览器的关闭⽽销毁，⽽是由设置的时间来决定。

3.4 继续学习Cookie网上有很多资料可参考：cookie技术不仅后端有，前端也有

[1.菜鸟教程servlet-cookies](https://www.runoob.com/servlet/servlet-cookies-handling.html) <br>
[2.菜鸟教程Js-cookies](https://www.runoob.com/js/js-cookies.html) <br>
[3.技术博客1](https://mp.weixin.qq.com/s/JW7mxXEqrV1rZ_pQOteXGQ) <br>
[4.技术博客2](https://www.cnblogs.com/xdp-gacl/p/3803033.html) <br>
[5.js-cookie的github仓库-](https://github.com/js-cookie/js-cookie)

3.5 SpringBoot中使用Cookie技术及实现自动登陆功能

[参考博客1](https://www.cnblogs.com/zimug/p/11785225.html) <br>
[参考博客2](https://www.yisu.com/zixun/232453.html) 

### 4.Session

4.1 什么是Session？

Session和Cookie一样，也是用来保存验证用户请求信息的，它会把客户端传来的Cookie信息和服务端的Session信息进行比较，看是否相同，若相同则
说明是同一用户的，通过验证，否则说明不是，验证不会通过。
