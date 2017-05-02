package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EventAspect {
	
	@Before("execution(* com.example.service.EventService.play*(..))")
	public void setup(JoinPoint jp){
		System.out.println("Customers sit down");
	}
	
	@Around("execution(* com.example.service.EventService.run*(..))")
	public void testAroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("Set up rides");
		
		pjp.proceed(); //method runs
		
		System.out.println("Clean up rides");
		
	}
	
}
