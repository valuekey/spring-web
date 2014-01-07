package com.baobaotao.anno;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    /**
     * [メソッドの説明を書きましょう]
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "com/baobaotao/anno/beans.xml");
        ctx.destroy();
    }

}
