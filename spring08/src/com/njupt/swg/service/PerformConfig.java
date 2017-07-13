package com.njupt.swg.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class PerformConfig {
	@Bean
	public PerformAop performAop(){
		return new PerformAop();
	}
}
