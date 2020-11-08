package com.martini.demo01;

/**
 * @author martini at 2020/11/8 19:31
 */
public interface Jdbc {
    default void connect() {
        System.out.println(getType() + " is connected.");
    }
    default void query() {
        System.out.println(getType() + "is queried.");
    }
    default void update() {
        System.out.println(getType() + "is updated.");
    }
    String getType();
    default String currentConnectionInfo(MyConnection connection) {
        return connection.getConnectionName() + " is using " + getType();
    }
}
