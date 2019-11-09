package com.epoint.handler;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EntityAspectHandler {

    @Pointcut("execution(* com.epoint.core.AbstractService.save(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint ){
        System.out.println("切面执行了");
        Signature signature = joinPoint.getSignature();

    }
}
