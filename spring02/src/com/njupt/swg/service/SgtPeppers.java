package com.njupt.swg.service;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	@Override
	public void play() {
		System.out.println("hello spring!!");
	}

}
