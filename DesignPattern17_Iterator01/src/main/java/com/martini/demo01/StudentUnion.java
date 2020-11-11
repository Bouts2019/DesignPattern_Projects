package com.martini.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author martini at 2020/11/10 16:17
 */
public class StudentUnion implements Aggregate {

    List<Student> students;

    public StudentUnion() {
        students = new ArrayList<Student>(5);
    }

    public void getName() {
        System.out.println("Student Union");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Iterator<Student> iterator() {
        return new StudentUnionIterator(students);
    }
}
