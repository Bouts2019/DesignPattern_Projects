package com.martini.demo01;

import java.util.Iterator;

/**
 * @author martini at 2020/11/10 15:42
 */
public class IteratorDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("张三", 22);
        Student s3 = new Student("张三2", 23);
        Aggregate aggregate1 = new Class();
        aggregate1.addStudent(s1);
        aggregate1.addStudent(s2);
        aggregate1.addStudent(s3);
        Aggregate aggregate2 = new StudentUnion();
        aggregate2.addStudent(s1);
        aggregate2.addStudent(s2);
        aggregate2.addStudent(s3);

        traverse(aggregate1.iterator());
        traverse(aggregate2.iterator());
    }
    public static void traverse(Iterator<Student> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
