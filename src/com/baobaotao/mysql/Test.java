package com.baobaotao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        
        Connection connection = null;
        Statement statement = null;
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/baobaotao/mysql/beans.xml");
        BasicDataSource dataSource = (BasicDataSource) ctx.getBean("dataSource");
        try {

            ResultSet resultSet = null;

//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/world", "root", "root");
            
//            connection = dataSource.getConnection();
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            resultSet = statement
                    .executeQuery("select * from city");
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

}
