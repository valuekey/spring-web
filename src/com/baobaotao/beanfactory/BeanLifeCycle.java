package com.baobaotao.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.baobaotao.Car;

public class BeanLifeCycle {

    /**
     * [メソッドの説明を書きましょう]
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        LifeCycleInBeanFactory();
    }

    private static void LifeCycleInBeanFactory() {
        Resource res = new ClassPathResource(
                "com/baobaotao/beanfactory/beans.xml");
        BeanFactory bf = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(
                (DefaultListableBeanFactory) bf);
        reader.loadBeanDefinitions(res);

        ((ConfigurableBeanFactory) bf)
                .addBeanPostProcessor(new MyBeanPostProcessor());

        ((ConfigurableBeanFactory) bf)
                .addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        Car car1 = (Car) bf.getBean("car");
        car1.introduce();
        car1.setColor("RED");

        Car car2 = (Car) bf.getBean("car");
        car2.introduce();
        System.out.println("car1==car2:" + (car1 == car2));

        ((DefaultListableBeanFactory) bf).destroySingletons();

    }

}
