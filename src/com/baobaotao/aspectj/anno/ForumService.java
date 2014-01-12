package com.baobaotao.aspectj.anno;


public class ForumService {
    @NeedTest(value=true)
    public void remove(int forumId) {
        
    }
    @NeedTest(false)
    public void updateForum(String forum) {
        
    }
}
