package com.njupt.swg.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PerformAop {
		@Before("execution(* com.njupt.swg.service.Perform.perform(..))")
		public void BeforePerform(){
			System.out.println("先找好位置!");
		}
		
		@After("execution(* com.njupt.swg.service.Perform.perform(..))")
		public void AfterPerform(){
			System.out.println("请依次离座!");
		}
}
