package org.liumf.boot.common.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * Copyright: Copyright (c) 2019 AsiaInfo
 *
 * @ClassName: DBUtils
 * @Description: JDBC工具类
 * @version: v1.0.0
 * @author: dreamFly
 * @date: 17:47 2019/12/27
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 17:47       dreamFly           v1.1.0
 */
public class DBUtils {

    static Properties properties;

    /**
     * 加载properties数据库连接配置文件
     */
    static {
        properties = new Properties();
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * @return java.sql.Connection
     * @author dreamFly
     * @description 获取数据库连接
     * @params []
     * @time 2019/12/27 17:15
     * @version V1.0
     */
    public static Connection getConnection() {

        try {
            Class.forName(properties.getProperty("driver"));
            return DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("userName"), properties.getProperty("passWord"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @return void
     * @author dreamFly
     * @description 关闭资源
     * @params [resultSet, statement, connection]
     * @time 2019/12/27 17:16
     * @version V1.0
     */
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {

        if (null != resultSet) {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (null != statement) {
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (null != connection) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet resultSet) {
        if (null != resultSet) {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Statement statement) {
        if (null != statement) {
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection connection) {

        if (null != connection) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}