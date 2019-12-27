package org.liumf.boot.dao;


import lombok.extern.slf4j.Slf4j;
import org.liumf.boot.common.utils.DBUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Copyright: Copyright (c) 2019 AsiaInfo
 *
 * @ClassName: DBUtilTest
 * @Description: 测试连接工具
 * @version: v1.0.0
 * @author: dreamFly
 * @date: 17:49 2019/12/27
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 17:49       dreamFly           v1.1.0
 */
@Slf4j
public class DBUtilTest {

    // private static final Logger logger = LoggerFactory.getLogger(DBUtilTest.class);

    public void connDB() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement("select COUNT(*) from hr");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                log.debug(String.valueOf(resultSet.getInt(1)));
                log.error("测试日志");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(resultSet, preparedStatement, connection);
        }

    }
}