package com.njupt.swg.service;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component("cdPlayer")
public class CDPlayer implements MediaPlayer {
	@Inject
	private CD cd;
	@Override
	public void play() {
		cd.play();
	}

}
