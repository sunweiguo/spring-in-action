package com.njupt.swg.service;

import org.springframework.stereotype.Component;

@Component
public class Perform implements IPerform {

	@Override
	public void perform() {
		System.out.println("表演进行中。。。");
	}

}

