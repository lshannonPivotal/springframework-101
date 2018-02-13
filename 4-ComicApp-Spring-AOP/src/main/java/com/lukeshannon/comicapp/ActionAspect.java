package com.lukeshannon.comicapp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ActionAspect {

	
	@Before("execution(* saveTheDay(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("******");
		System.out.println("We are about to save the day!");
		System.out.println("The Hero In Action : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}


}
