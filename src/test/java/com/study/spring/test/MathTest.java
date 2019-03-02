package com.study.spring.test;

import com.study.spring.aop.MathCalculate;
import com.study.spring.config.MathCalculateConfigOfAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MathTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MathCalculateConfigOfAop.class);
        MathCalculate mathCalculate = (MathCalculate)context.getBean("mathCalculate");
        int div = mathCalculate.div(4, 0);
        System.out.println(div);
    }
}
