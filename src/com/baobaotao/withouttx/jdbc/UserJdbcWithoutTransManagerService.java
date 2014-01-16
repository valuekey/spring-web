package com.baobaotao.withouttx.jdbc;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserJdbcWithoutTransManagerService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addScore(String userName, int toAdd) {
        String sql = "UPDATE T_USER T SET T.SCORE = T.SCORE + ? WHERE USER_NAME = ?";
        jdbcTemplate.update(sql, toAdd, userName);
    }
    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/baobaotao/withouttx/jdbc/jdbcWithoutTx.xml");
        UserJdbcWithoutTransManagerService service = (UserJdbcWithoutTransManagerService) ctx.getBean("userService");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        BasicDataSource basicDataSource = (BasicDataSource) jdbcTemplate.getDataSource();
        basicDataSource.setDefaultAutoCommit(false);
        System.out.println(basicDataSource.getDefaultAutoCommit());
        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        DateFormat format = new SimpleDateFormat("yyMMddHHmmss");
        
        jdbcTemplate.execute("INSERT INTO T_USER(USER_NAME,PASSWORD,SCORE,LAST_LOGON_TIME) VALUES('tom','123456',10," + format.format(timestamp) + ")");
        service.addScore("tom", 20);
        
        int score = jdbcTemplate.queryForInt("SELECT T.SCORE FROM T_USER T WHERE T.USER_NAME = 'tom' ORDER BY T.LAST_LOGON_TIME DESC LIMIT 0,1");
        System.out.println(score);
        jdbcTemplate.execute("DELETE FROM T_USER WHERE USER_NAME = 'tom'");
    }
}
