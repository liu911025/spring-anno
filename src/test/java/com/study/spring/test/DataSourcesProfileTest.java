package com.study.spring.test;

import com.study.spring.config.DataSourcesConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class DataSourcesProfileTest {


    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourcesConfig.class);
        String[] names = context.getBeanNamesForType(DataSource.class);

        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("test");
        context.register(DataSourcesConfig.class);
        context.refresh();
        String[] names = context.getBeanNamesForType(DataSource.class);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
