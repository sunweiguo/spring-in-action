package com.njupt.swg.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayConfig {
	@Bean
	public CD CDImpl(){
		return new CDImpl();
	}
	
	@Bean
	public MediaPlayer CDPlayer(CDImpl cd){
		return new CDPlayer(cd);
	}
}

