package com.study.spring.config;


import com.study.spring.aop.LogAspects;
import com.study.spring.aop.MathCalculate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MathCalculateConfigOfAop {

    @Bean
    public MathCalculate mathCalculate() {
        return new MathCalculate();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
