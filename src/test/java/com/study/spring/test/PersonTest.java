package com.study.spring.test;

import com.study.spring.Person;
import com.study.spring.config.PersonConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by liujiatai on 2019/3/2.
 */
public class PersonTest {

    AnnotationConfigApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(PersonConfig.class);
    }

    @Test
    public void test01() {
        System.out.println("IOC容器初始化...");
        String[] names = context.getBeanDefinitionNames();
        System.out.println("----------------容器中的类----------------");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----------------容器中的类----------------");
        Person person1 = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");
        System.out.println(person1 == person2);
    }

    @Test
    public void test02() {
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
    }

    @Test
    public void test03() {
        String[] names = context.getBeanDefinitionNames();

        System.out.println("----------------容器中的类----------------");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----------------容器中的类----------------");

        context.close();
    }
}
