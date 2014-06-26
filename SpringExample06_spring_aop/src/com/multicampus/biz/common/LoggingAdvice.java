package com.multicampus.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LoggingAdvice {
    @Pointcut("execution(* com.multicampus.biz.user.impl.UserDAO.get*(..))")
    public void logging(){}

	@Before("logging()")
	public void beforeLog() throws Throwable {
		System.out.println("[사전충고] 메소드가 호출되기 전에 필요한 작업 처리.");
	}
}
