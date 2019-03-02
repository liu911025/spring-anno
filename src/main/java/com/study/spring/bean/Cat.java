package com.study.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;

public class Cat implements Pet, BeanPostProcessor, InitializingBean {

    public Cat() {
        System.out.println("cat... Construct");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization ----------" + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization-------------" + s);
        return o;
    }

    @Override
    @PostConstruct
    public void running() {
        System.out.println("cat... PostConstruct");
    }

    @Override
    public void back() {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat... afterPropertiesSet");
    }
}
