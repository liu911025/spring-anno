package com.study.spring.test;

import com.study.spring.bean.Sheep;
import com.study.spring.config.BeanConfigAndLifeCycle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class BeanConfigAndLifeCycleTest{

    AnnotationConfigApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(BeanConfigAndLifeCycle.class);
        System.out.println("容器初始化完成...");
    }

    @Test
    public void test01() {
        String[] names = context.getBeanDefinitionNames();

        Sheep sheep = (Sheep) context.getBean("sheep");
        System.out.println(sheep);
        context.close();

        System.out.println("--------------------------------------------------");
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("sheep.name");
        System.out.println(property);
        System.out.println("--------------------------------------------------");
    }

}
