package com.vnlemanhthanh.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Before("execution(* com.vnlemanhthanh.*.*(..))")
    public void beforeAddAccountAdvice() {
        System.out.print("\t------> Executing @Before advice on method() of ");

    }
}
