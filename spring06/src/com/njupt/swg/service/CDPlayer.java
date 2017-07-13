package com.njupt.swg.service;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements ICDPlayer {
	private ICD cd;
	
	@Autowired
	public CDPlayer(CD cd){
		this.cd = cd;
	}
	@Override
	public void play() {
		cd.play();
	}

}
