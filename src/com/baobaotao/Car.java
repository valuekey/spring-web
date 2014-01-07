package com.baobaotao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean,
        DisposableBean {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getBeanName() {
        return beanName;
    }

    private String brand;
    private String color;
    private int speed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("Car()");
    }

    public void setBrand(String brand) {
        System.out.println("serBrand()");
        this.brand = brand;
    }

    public void introduce() {
        System.out.println("brand:" + this.brand + " color:" + this.color
                + " speed:" + this.speed);
    }

    @Override
    public void destroy() throws Exception {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("afterPropertiesSet()");
    }

    @Override
    public void setBeanName(String beanName) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("setBeanName()");
        this.beanName = beanName;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    public void myInit() {
        System.out.println("myInit()");
        this.speed = 240;
    }

    public void myDestory() {
        System.out.println("myDestory()");
    }

}
