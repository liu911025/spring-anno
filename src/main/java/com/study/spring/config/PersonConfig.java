package com.study.spring.config;

import com.study.spring.Car;
import com.study.spring.Person;
import com.study.spring.condition.PersonCondition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by liujiatai on 2019/3/2.
 */
@Configuration
/*
@ComponentScan(basePackages={"com.study.spring"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class, Repository.class})})
*/
/*@ComponentScan(basePackages={"com.study.spring"},
includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class, Repository.class})}, useDefaultFilters = false)*/

/*@ComponentScans(
        @ComponentScan(basePackages={"com.study.spring"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class, Repository.class})})
)*/
/*@ComponentScans(
        @ComponentScan(basePackages={"com.study.spring"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})})
)*/
@ComponentScan("com.study.spring")
public class PersonConfig {

    /**
     * @Scope
     * 多例的情况下,容器不初始化Bean,使用时再创建
     * 单例情况下,容器先创建bean
     * @return
     */
    //@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

    /**
     * @Lazy 针对单例的懒加载,容器不初始化Bean,使用时再创建
     * @return
     */
    //@Lazy
    //@Bean
    public Person person() {
        System.out.println("Person 创建...");
        return new Person();
    }


    @Conditional({PersonCondition.class})
    @Bean
    public Car car() {
        return new Car();
    }
}
