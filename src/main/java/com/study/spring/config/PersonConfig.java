package com.study.spring.config;

import com.study.spring.Person;
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

@ComponentScans(
        @ComponentScan(basePackages={"com.study.spring"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class, Repository.class})})
)

public class PersonConfig {

    @Bean
    public Person person() {
        return new Person();
    }
}
