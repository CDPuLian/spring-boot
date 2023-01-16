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



    @Around(AroundCut.POINT_CUT)
    public DataResult checkSession(ProceedingJoinPoint pjp) throws Throwable {
        //获取session
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        Object userInfo = session.getAttribute("userInfo");
        if(null == userInfo){//session不存在, 返回登录失效
            return DataResult.errByErrCode(Code.LOGIN_OUT);
        }
        return (DataResult) pjp.proceed();
    }
}
