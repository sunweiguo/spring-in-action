package com.njupt.swg.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.njupt.swg.service.IPerform;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class test {
	@Test
	public void test01(){
		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");  
	     IPerform p = apc.getBean("perform",IPerform.class);  
	     p.perform();
	}
}
