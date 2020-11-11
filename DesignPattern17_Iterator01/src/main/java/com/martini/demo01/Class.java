package com.martini.demo01;

import java.util.Iterator;

/**
 * @author martini at 2020/11/10 16:11
 */
public class Class implements Aggregate {
    Student[] students;
    int numOfStudents = 0;

    public Class() {
        students = new Student[5];
    }

    public void getName() {
        System.out.println("Class");
    }

    public void addStudent(Student student) {
        students[numOfStudents++] = student;
    }

    public Iterator<Student> iterator() {
        return new ClassIterator(students);
    }
}
