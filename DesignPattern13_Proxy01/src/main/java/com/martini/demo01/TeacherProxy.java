package com.martini.demo01;

/**
 * @author martini at 2020/11/8 21:25
 */
public class TeacherProxy implements Teach {
    Teach target;

    public TeacherProxy(Teach target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("Proxy before target running.");

        target.teach();

        System.out.println("Proxy after target running.");
    }
}
