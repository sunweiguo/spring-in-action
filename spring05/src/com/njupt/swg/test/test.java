package com.njupt.swg.test;

import static org.junit.Assert.assertNotNull;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.njupt.swg.service.CD;
import com.njupt.swg.service.CDPlayConfig;
import com.njupt.swg.service.CDPlayer;
import com.njupt.swg.service.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayConfig.class)
public class test {
	@Inject
	private CD cd;
	@Inject
	private MediaPlayer mp;
	@Test
	public void test01(){
		cd.play();
	}
	
	@Test
	public void test02(){
		mp.play();
	}
}

