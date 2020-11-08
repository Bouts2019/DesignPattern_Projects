package com.martini.demo01;

/**
 * @author martini at 2020/11/8 19:37
 */
public class OracleImpl implements Jdbc {
    @Override
    public String getType() {
        return "DB2";
    }
}
