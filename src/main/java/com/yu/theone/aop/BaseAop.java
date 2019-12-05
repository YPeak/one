package com.yu.theone.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by shuwei.yu.
 * on 2019/12/5.
 */
@Slf4j
@Aspect
@Component
public class BaseAop {
    @Pointcut("execution(public * com.yu.theone.controller..*.*(..))")
    public void webLog(){}

    /**
     * 前置通知：在连接点之前执行的通知
     * @param joinPoint
     * @throws Throwable
     */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
    }

    @After("webLog()")
    public void doAfter(JoinPoint joinPoint) {
       log.info("后置方法");
    }

    /**
     *  returning:和方法参数一致，用于接收返回值
     * on 2019/12/5.
     */
    @AfterReturning(value = "webLog()",returning = "obj")
    public void doAfterReturning(Object obj) {
        log.info("获取返回值：{}",obj);
    }

    /**
     *  异常之后进入该方法
     * on 2019/12/5.
     */
    @AfterThrowing(value = "webLog()",throwing = "throwable")
    public void doAfterThrowing(JoinPoint joinPoint,Throwable throwable) {
        log.info("获取返回值：{}",throwable.toString());
    }

    /**
     *  么有搞懂是干啥的
     * on 2019/12/5.
     */
//    @Around("webLog()")
//    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) {
//        log.info("获取返回值：{}",proceedingJoinPoint.toString());
//        return null;
//    }
}
