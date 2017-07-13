package com.njupt.swg.service;

import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Component("sgtPeppers")
@Named("sgtPeppers")
public class SgtPeppers implements CompactDisc {

	@Override
	public void play() {
		System.out.println("hello spring!!");
	}

}
