package com.baobaotao.beanfactory;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class BeanFactoryTest {
    public static void main(String[] args) throws Throwable {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:com/baobaotao/beanfactory/beans.xml");
        BeanDefinitionRegistry registry = new 
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.set
        
    }

}
