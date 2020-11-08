package com.martini.demo01;

/**
 * @author martini at 2020/11/8 19:30
 */
public class Flyweight01 {
    public static void main(String[] args) {
        JdbcPool pool = JdbcPool.getInstance();
        Jdbc conn1 = pool.get("MySQL");
        Jdbc conn2 = pool.get("mysql");
        Jdbc conn3 = pool.get("Oracle");
        Jdbc conn4 = pool.get("oracle");
        System.out.println(conn1.currentConnectionInfo(new MyConnection("thread1")));
        System.out.println(conn2.currentConnectionInfo(new MyConnection("thread2")));
        System.out.println(conn3.currentConnectionInfo(new MyConnection("thread3")));
        System.out.println(conn4.currentConnectionInfo(new MyConnection("thread4")));
        System.out.println(pool.size());
    }
}
