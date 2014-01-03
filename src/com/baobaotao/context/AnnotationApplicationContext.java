package com.baobaotao.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.baobaotao.reflect.Car;

public class AnnotationApplicationContext {

    /**
     * [メソッドの説明を書きましょう]
     * @param args
     */
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
        
        Car car = ctx.getBean("car",Car.class);
        car.introduce();

    }

}
