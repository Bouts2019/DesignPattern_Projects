package com.martini.demo01;

/**
 * @author martini at 2020/11/10 14:33
 */
public class VisitorDemo01 {
    public static void main(String[] args) {
        // 创建ObjectStructure
        Travel travel = new Travel();
        travel.attach(new China());
        travel.attach(new Japan());
        travel.attach(new America());
        travel.display(new Chinese());
    }
}
