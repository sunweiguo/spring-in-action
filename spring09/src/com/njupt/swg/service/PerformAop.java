package com.njupt.swg.service;

import org.springframework.stereotype.Component;

@Component("performAop")
public class PerformAop {
		public void BeforePerform(){
			System.out.println("先找好位置!");
		}
		
		public void AfterPerform(){
			System.out.println("请依次离座!");
		}
}
