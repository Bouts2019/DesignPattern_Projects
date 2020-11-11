package com.martini.demo01;

/**
 * @author martini at 2020/11/10 17:21
 */
public class Alice implements Owner {
    private final String PERSON_NAME = "Alice";
    public void feed(String name, String color, int hungry) {
        System.out.println(PERSON_NAME + " notices " + name + " is hungry now, " + PERSON_NAME + " is feeding.");
    }
}
