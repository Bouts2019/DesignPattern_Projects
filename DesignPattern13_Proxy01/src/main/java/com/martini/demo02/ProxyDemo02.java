package com.martini.demo02;

/**
 * @author martini at 2020/11/8 21:38
 */
public class ProxyDemo02 {
    public static void main(String[] args) {
        // 创建目标对象
        Teach target = new Teacher();
        // 给目标对象创建代理对象，可以转成接口类型
        Teach proxyInstance = (Teach)new ProxyFactory(target).getProxyInstance();
//        System.out.println("Type: " + proxyInstance);
        System.out.println("Type: " + proxyInstance.getClass());
        proxyInstance.teach();
    }
}
