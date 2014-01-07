package com.baobaotao.beanprop;

import javax.activation.DataSource;

public class SysConfig {
    private int sessionTimeout;
    private int maxTabPageNum;
    private DataSource dataSource;
    
    public void initFromDB() {
        this.sessionTimeout = 30;
        this.maxTabPageNum = 10;
    }

    public int getSessionTimeout() {
        return sessionTimeout;
    }

    public int getMaxTabPageNum() {
        return maxTabPageNum;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    
}
