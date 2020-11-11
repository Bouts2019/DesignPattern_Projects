package com.martini.demo01;

import java.util.Iterator;

/**
 * @author martini at 2020/11/10 15:47
 */
public interface Aggregate {
    void getName();
    void addStudent(Student student);
    Iterator<Student> iterator();
}
