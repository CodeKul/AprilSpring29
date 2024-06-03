package com.codekul.aprilspring29.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Human {

    //advice
//    @Before(value = "pointcut()")
//    public void wakeUp(){
//        System.out.println("wake up");
//    }
//
//    @After(value = "execution(public void study*())")
//    public void sleep(){
//        System.out.println("sleep");
//    }
//
    @Pointcut(value = "execution(public int study(..))")
    public void pointcut(){

    }

    @AfterReturning(value = "pointcut()",returning = "value")
    public void afterRet(int value){
        System.out.println("in after ret ==>"+value);
    }

}
