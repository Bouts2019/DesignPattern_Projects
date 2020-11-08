package com.martini.demo01;

/**
 * @author martini at 2020/11/8 19:35
 */
public class MyConnection {
    private String connectionName;

    public MyConnection(String connectionName) {
        this.connectionName = connectionName;
    }

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }
}
