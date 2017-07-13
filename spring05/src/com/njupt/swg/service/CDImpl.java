package com.njupt.swg.service;

import org.springframework.stereotype.Component;

@Component
public class CDImpl implements CD {

	@Override
	public void play() {
		System.out.println("hello spring!!");
	}

}

