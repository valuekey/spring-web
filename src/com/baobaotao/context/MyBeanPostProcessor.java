package com.baobaotao.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.baobaotao.Car;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if ("car".equals(beanName)) {
            Car car = (Car) bean;
            if (car.getSpeed() >= 200) {
                System.out.println("postProcessBeforeInitialization()");
                car.setSpeed(200);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if ("car".equals(beanName)) {
            Car car = (Car) bean;
            if (car.getColor() == null) {
                System.out.println("postProcessAfterInitialization()");
                car.setColor("BLACK");
            }
        }
        return bean;
    }

}
