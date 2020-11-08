package com.martini.demo01;

/**
 * @author martini at 2020/11/8 17:47
 */
public class FacadeDemo01 {
    public static void main(String[] args) {
        ControlSystem instance = ControlSystem.getInstance();
        instance.ready();
        instance.work();
        instance.close();
    }
}
