package com.martini.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author martini at 2020/11/8 19:39
 */
public class JdbcPool {
    private static JdbcPool instance;
    private JdbcPool() {}
    static {
        instance = new JdbcPool();
    }

    public static JdbcPool getInstance() {
        return instance;
    }

    Map<String, Jdbc> pool = new HashMap<>(16);

    public Jdbc get(String type) {
        type = type.toLowerCase();
        Jdbc jdbc = pool.get(type);
        if (jdbc == null) {
            switch (type) {
                case "mysql":
                    jdbc = new MySQLImpl();
                    break;
                case "db2":
                    jdbc = new DB2Impl();
                    break;
                case "oracle":
                    jdbc = new OracleImpl();
                    break;
                default:
            }
            if (jdbc != null) pool.put(type, jdbc);
        }
        return jdbc;
    }

    public int size() {
        return pool.size();
    }
}
