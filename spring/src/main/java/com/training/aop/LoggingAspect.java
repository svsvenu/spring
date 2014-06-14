package com.training.aop;

import javax.inject.Named;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Named
 @Aspect
public class LoggingAspect {


//	@Before("execution(* com.training.model.DepartmentDAO.findByPrimaryKey(..))")
//	public void logBefore(JoinPoint joinPoint) {
//	System.out.println("About to execute find by primaryKey");
//	}
	
	@Around("execution(* com.training.model.DepartmentDAO.findByPrimaryKey(..))")
	public void logExectutionTime(ProceedingJoinPoint joinpoint){
	try {
	System.out.println("Just before calling the method");
 
	long start=System.currentTimeMillis();
	joinpoint.proceed(); 
	long end=System.currentTimeMillis();
	
	System.out.println("Just after calling the method");
	System.out.println("Theperformancetook"+(end-start)+ "milliseconds.");
	
	} catch(Throwable t){
	System.out.println("Boo!Wewantourmoneyback!");
	}
	}
	
	
	
	}