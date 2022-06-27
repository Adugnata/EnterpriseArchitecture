package com.account;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TraceAdvice {
    @Before("execution(* com.account.AccountService.*(..))")
    public void tracebeforemethod(JoinPoint joinpoint) {
        System.out.println("before execution of method " + joinpoint.getSignature().getName());
    }

    @After("execution(* com.account.AccountService.*(..))")
    public void traceaftermethod(JoinPoint joinpoint) {

    }
}
