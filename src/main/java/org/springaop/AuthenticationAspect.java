package org.springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(org.springaop..*)")
    public void authenticationPointCut(){
        System.out.println("Authenticated");
    }

    @Pointcut("within(org.springaop.*)")
    public void authorizationPointCut(){
        System.out.println("Authorized");
    }

    @Before("authenticationPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the Request.....");
    }
}
