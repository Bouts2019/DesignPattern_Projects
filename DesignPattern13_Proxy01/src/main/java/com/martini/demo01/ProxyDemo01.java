package com.martini.demo01;

/**
 * @author martini at 2020/11/8 21:17
 */
public class ProxyDemo01 {
    public static void main(String[] args) {
        Teach teach = new TeacherProxy(new Teacher());
        teach.teach();
    }
}
