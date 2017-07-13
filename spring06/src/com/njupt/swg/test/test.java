package com.njupt.swg.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.njupt.swg.service.ICD;
import com.njupt.swg.service.ICDPlayer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class test {
	@Test
	public void test01(){
		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");  
	     ICD cd = apc.getBean("cd",ICD.class);  
	     cd.play();
	}
	
	@Test
	public void test02(){
		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");  
		ICDPlayer cdPlayer = apc.getBean("cdPlayer",ICDPlayer.class);  
		cdPlayer.play();
	}
}
