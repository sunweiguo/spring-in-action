package com.njupt.swg.service;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements ICDPlayer {
	private ICD cd;
	
	public ICD getCd() {
		return cd;
	}
	@Autowired
	public void setCd(ICD cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		cd.play();
	}

}
