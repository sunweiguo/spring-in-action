package com.njupt.swg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.njupt.swg.service.HelloWorld;

public class test{
	public static void main(String[] args) {
		 ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");  
	     HelloWorld hello = apc.getBean("helloWorld",HelloWorld.class);  
	     System.out.println(hello.sayHi());  
	}
}

