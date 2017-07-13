package com.njupt.swg.test;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.njupt.swg.service.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class test {
	//@Resource(name="sgtPeppers")
	//@Autowired
	@Inject
	private CompactDisc sgtPeppers;
	@Test
	public void test01(){
		assertNotNull(sgtPeppers);
		sgtPeppers.play();
	}
}
