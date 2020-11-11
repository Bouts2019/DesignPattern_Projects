package com.martini.demo01;

import java.util.Iterator;

/**
 * @author martini at 2020/11/10 15:52
 */
public class ClassIterator implements Iterator<Student> {

    private Student[] students;
    private int pos = 0;

    public ClassIterator(Student[] students) {
        this.students = students;
    }

    public boolean hasNext() {
        return pos != students.length && students[pos] != null;
    }

    public Student next() {
        return students[pos++];
    }

    public void remove() {

    }
}
