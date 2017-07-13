package com.njupt.swg.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.njupt.swg.service.IPerform;
import com.njupt.swg.service.PerformConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PerformConfig.class)
public class test {
	@Autowired
	private IPerform p;
	@Test
	public void test01(){
		assertNotNull(p);
		p.perform();
	}
}
