package com.martini.demo03;

/**
 * @author martini at 2020/11/9 08:19
 */
public class ProxyDemo03 {
    public static void main(String[] args) {
        // 1. 获取目标对象
        Teacher target = new Teacher();
        // 2. 获取代理对象，并且将目标对象聚合进代理对象
        ProxyFactory factory = new ProxyFactory(target);
        Teacher proxyInstance = (Teacher)factory.getProxyInstance();
        // 3. 执行代理对象方法，会触发intercept方法，实现对目标对象的代理
        proxyInstance.teach();
    }
}
