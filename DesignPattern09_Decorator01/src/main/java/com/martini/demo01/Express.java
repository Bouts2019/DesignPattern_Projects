package com.martini.demo01;

/**
 * 快递点
 * @author martini at 2020/11/8 16:01
 */
public class Express {
    public static void main(String[] args) {
        // 1. 首先需要一个主要要打包的物体
        Stuff stuff = new Cup();
        System.out.println(stuff.getDesc() + stuff.cost());
        // 2. 加上一个泡沫
        stuff = new Foam(stuff);
        System.out.println(stuff.getDesc() + stuff.cost());
        // 3. 再加上一个泡沫
        stuff = new Foam(stuff);
        System.out.println(stuff.getDesc() + stuff.cost());
        // 4. 再加上一个气垫
        stuff = new AirCushion(stuff);
        System.out.println(stuff.getDesc() + stuff.cost());
    }
}
