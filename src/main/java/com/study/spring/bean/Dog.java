package com.study.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 实现 ApplicationContextAware 可以拿到 ApplicationContext容器
 */
public class Dog implements Pet, InitializingBean, DisposableBean,BeanPostProcessor, ApplicationContextAware {

    ApplicationContext applicationContext;

    public Dog() {
        System.out.println("dog is Construct ing...");
    }

    @Override
    public void running() {
        System.out.println("dog is running...");
    }

    @Override
    public void back() {
        System.out.println("dog is back...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("dog is destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("dog is afterPropertiesSet()...");
    }

    @PostConstruct
    public void postConstruct() throws Exception {
        System.out.println("dog is postConstruct()");
    }
    @PreDestroy
    public void preDestroy() throws Exception {
        System.out.println("dog is preDestroy()");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("dog is postProcessBeforeInitialization()" + o);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("dog is postProcessAfterInitialization()" + o);
        return o;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
