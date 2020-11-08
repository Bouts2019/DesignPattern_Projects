package com.martini.demo01;

/**
 * @author martini at 2020/11/8 21:24
 */
public class Teacher implements Teach{
    @Override
    public void teach() {
        System.out.println("Teacher teaching...");
    }
}
