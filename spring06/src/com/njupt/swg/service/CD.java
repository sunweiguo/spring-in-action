package com.njupt.swg.service;

import java.util.List;

public class CD implements ICD {
	private String name;
	private String content;
	private List<String> style;
	
	public CD(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}

	public CD(String name, String content, List<String> style) {
		super();
		this.name = name;
		this.content = content;
		this.style = style;
	}

	@Override
	public void play() {
		for(String s:style){
			System.out.println("hello "+name+"-----"+content+"-----"+s);
		}
	}

}
