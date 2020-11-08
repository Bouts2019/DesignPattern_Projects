package com.martini.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author martini at 2020/11/8 21:39
 */
public class ProxyFactory {
    // 维护一个目标对象，直接以Object类型维护即可。
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        /*
            public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
            - 参数说明：
                1. loader：目标对象的类加载器
                2. interfaces：目标对象实现的接口
                3. h：事件处理，执行目标对象的方法时，会触发事件处理器的方法，
                    即，会把当前目标对象执行的方法作为一个参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println(method.getName());
            System.out.println("JDK Proxy Started.");
            // 执行结果
//            Object res = method.invoke(proxy, args);
            // 以上代码将会无限循环
            Object res = method.invoke(target, args);
            System.out.println("JDK Proxy Ended.");
            return res;
        });
    }
}
