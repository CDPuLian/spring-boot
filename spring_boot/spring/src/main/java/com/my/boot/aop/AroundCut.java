package com.my.boot.aop;

import com.my.boot.utils.DataResult;
import com.my.boot.utils.code.Code;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;


@Aspect
@Component
public class AroundCut {
    public static final String POINT_CUT = "execution(* com.my.boot.controller.AuthorityController.*(..)) || " +
            "execution(* com.my.boot.controller.UserController.*(..)) || ";
}
