package com.njupt.swg.service;

import java.util.List;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public class CD implements ICD {
	private String name;
	private String content;
	private List<String> style;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getStyle() {
		return style;
	}

	public void setStyle(List<String> style) {
		this.style = style;
	}

	@Override
	public void play() {
		for(String s:style){
			System.out.println(name+"---"+content+"----"+s);
		}
	}

}
