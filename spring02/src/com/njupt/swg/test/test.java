package com.njupt.swg.test;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.njupt.swg.service.CDPlayConfig;
import com.njupt.swg.service.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayConfig.class)
public class test {
	@Autowired
	private CompactDisc cp;
	@Test
	public void test01(){
		assertNotNull(cp);
		cp.play();
	}
}

