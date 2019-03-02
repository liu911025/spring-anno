package com.study.spring.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.xml.transform.Source;

/**
 * 类创建条件
 */
public class PersonCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //bean工厂
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        //类加载
        ClassLoader classLoader = context.getClassLoader();

        //系统运行环境
        Environment environment = context.getEnvironment();
        System.out.println("系统运行环境: --->>>" + environment.getProperty("os.name"));

        BeanDefinitionRegistry registry = context.getRegistry();

        if (registry.containsBeanDefinition("person"))
            return true;

        return false;
    }
}
