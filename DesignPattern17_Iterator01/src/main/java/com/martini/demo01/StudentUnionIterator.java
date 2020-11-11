package com.martini.demo01;

import java.util.Iterator;
import java.util.List;

/**
 * @author martini at 2020/11/10 15:57
 */
public class StudentUnionIterator implements Iterator<Student> {

    private List<Student> students;
    private int pos = 0;

    public StudentUnionIterator(List<Student> students) {
        this.students = students;
    }

    public boolean hasNext() {
        return pos < students.size();
    }

    public Student next() {
        return students.get(pos++);
    }

    public void remove() {
    }
}
