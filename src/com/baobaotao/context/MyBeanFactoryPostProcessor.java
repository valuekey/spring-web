package com.baobaotao.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory bf)
            throws BeansException {
        BeanDefinition bd = bf.getBeanDefinition("car");

        bd.getPropertyValues().addPropertyValue("brand", "BBBBB");
        System.out.println("1111111111postProcessBeanFactory()");
    }

}
