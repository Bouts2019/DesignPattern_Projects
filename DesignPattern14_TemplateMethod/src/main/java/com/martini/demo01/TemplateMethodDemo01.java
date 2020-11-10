package com.martini.demo01;

/**
 * @author martini at 2020/11/9 08:50
 */
public class TemplateMethodDemo01 {
    public static void main(String[] args) {
        Machine machine1 = new Machine1();
        machine1.work();

        Machine machine2 = new Machine2();
        machine2.work();
    }
}
