package com.korit.library.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAop {

    @Pointcut("@annotation(com.korit.library.aop.annotation.ValidAspect)")
    private void pointCut(){}
}
