package com.baobaotao.advice;

import java.sql.SQLException;

public class ForumService {
    public void remove(int forumId) {
        throw new RuntimeException("runtime");
    }
    
    public void updateForum(String forum) throws Exception{
        throw new SQLException("shujugengxin shibai");
    }
}
