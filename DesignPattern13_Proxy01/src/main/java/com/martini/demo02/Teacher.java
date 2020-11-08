package com.martini.demo02;

/**
 * @author martini at 2020/11/8 21:39
 */
public class Teacher implements Teach {
    @Override
    public void teach() {
        System.out.println("Teacher teaching...");
    }
}
