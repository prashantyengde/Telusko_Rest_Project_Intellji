package com.telusko.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Aspect
@Component
public class AlienAOP
{
//    @Before(value= "execution(* com.telusko.controller.*.*(..))")
@Before(value= "execution(* com.telusko.controller.AlienController.*(..))")
public void beforeAdvice(JoinPoint joinPoint)
    {
        System.out.println("Before method: " + joinPoint.getSignature()+ " at "+ LocalTime.now());
    }
    @After(value= "execution(* com.telusko.controller.AlienController.*(..))")
    public void afterAdvice(JoinPoint joinPoint)
    {
        System.out.println("after method: " + joinPoint.getSignature()+ " at "+ LocalTime.now());
    }

    @Before(value= "execution(* com.telusko.service.*.*(..))")
    public void beforeAdviceService(JoinPoint joinPoint)
    {
        System.out.println("before method Service: " + joinPoint.getSignature()+ " at "+ LocalTime.now());
    }

    @After(value= "execution(* com.telusko.service.*.*(..))")
    public void afterAdviceService(JoinPoint joinPoint)
    {
        System.out.println("after method Service: " + joinPoint.getSignature()+ " at "+ LocalTime.now());
    }
}
