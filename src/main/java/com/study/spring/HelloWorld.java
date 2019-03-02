package com.study.spring;

import com.study.spring.config.PersonConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by liujiatai on 2019/3/1.
 */
public class HelloWorld {

    public static void main(String[] args) {
        /*BeanFactory applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person.toString());*/

        /*ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        int i = reader.loadBeanDefinitions(resource);
        Person bean = factory.getBean(Person.class);
        System.out.println(bean);*/

        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);*/
    }
}
