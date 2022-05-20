package com.example.demo.advices;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAdvice {

	//Logger logger = Logger.getAnonymousLogger();           //component
	
	@Before("execution(* com.example.demo.*.*.*(..))")
	public void logBeforeMethod(JoinPoint jp) {
		//logger.info(jp.getSignature().getName() + " == called == ");      //component
		log.info(jp.getSignature().getName() + " == called == ");              //slf4j
	}
	//here get signature refers as the method signature 
	//which contains method name and the arguments it have
	
	@Around("execution(* com.example.demo.services.LoanService.*(..))")
	public Object aroundAdviceMethod(ProceedingJoinPoint pjp) throws Throwable {
		 
		Object[] input = pjp.getArgs();
		System.out.println("First Argument $$$$$$$$$$$$$$$ : =" +input[0]);
		Integer actual = (Integer)input[0];
		actual = actual+5000;
		Object obj = pjp.proceed(new Integer[] {actual});
		//log.info(pjp.getSignature().getName() + " ++ called ++ ");           //slf4j
		//Object obj = pjp.proceed();
		Double resp = (Double)obj;
		resp = resp+2;
		log.info(pjp.getSignature().getName() + "  ++ completed ++");
	
		return resp;
	}
}









