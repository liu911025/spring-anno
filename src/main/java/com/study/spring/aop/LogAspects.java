package com.study.spring.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;



@Aspect
public class LogAspects {

    @Pointcut("execution(* com.study.spring.aop.MathCalculate.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println("执行方法{"+joinPoint.getSignature().getName()+"}之前,参数:{"+ Arrays.asList(joinPoint.getArgs())+"}");
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("执行方法{"+joinPoint.getSignature().getName()+"}结束...");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println("执行方法{"+joinPoint.getSignature().getName()+"},返回结果:{"+result+"}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void logException(JoinPoint joinPoint,Exception e) {
        System.out.println("执行方法{"+joinPoint.getSignature().getName()+"}异常:{"+e.getMessage()+"}");
    }

}
