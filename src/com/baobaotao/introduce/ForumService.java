package com.baobaotao.introduce;


public class ForumService{

    public void removeTopic(int topicId) {
//        PerformanceMonitor.begin("removeTopic");
        System.out.println("removeTopic:" + topicId);
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        PerformanceMonitor.end();
    }
    

    public void removeForum(int forumId) {
//        PerformanceMonitor.begin("removeForum");
        System.out.println("removeForum:" + forumId);
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        PerformanceMonitor.end();
    }
}
