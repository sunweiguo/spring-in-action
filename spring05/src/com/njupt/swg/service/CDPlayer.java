package com.njupt.swg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cdPlayer")
public class CDPlayer implements MediaPlayer {
	private CD cd;
	
	@Autowired
	public CDPlayer(CDImpl cd){
		this.cd = cd;
	}
	@Override
	public void play() {
		cd.play();
	}

}

