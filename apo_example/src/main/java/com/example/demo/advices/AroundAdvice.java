package com.example.demo.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class AroundAdvice {
	
	@Around("execution(* com.example.demo.services.LoanService.*(..))")
	public Object aroundAdviceMethod(ProceedingJoinPoint pjp) throws Throwable {
		 
		Object[] input = pjp.getArgs();
		System.out.println("First Argument $$$$$$$$$$$$$$$ : =" +input[0]);
		//System.out.println("Second Argument $$$$$$$$$$$$$$$ : =" +input[1]);
		Integer actual = (Integer)input[0];
		actual = actual+5000;
		System.out.println("actual : " +actual);
		Object obj = pjp.proceed(new Integer[] {actual});
		//log.info(pjp.getSignature().getName() + " ++ called ++ ");           //slf4j
		//Object obj = pjp.proceed();
		Double resp = (Double)obj;
		System.out.println("Resp : " +resp);
		resp = resp+2;
		System.out.println("After Resp added: " +resp);
		log.info(pjp.getSignature().getName() + "  ++ completed ++");
	
		return resp;
	}

}
