package org.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* org.springaop.ShoppingCart.checkout())")
    public  void logger(){
        System.out.println("loggers");
    }

    @After("execution(* org.springaop.ShoppingCart.checkout())")
    public void afterlogger(){
        System.out.println("After Logger");
    }

}
