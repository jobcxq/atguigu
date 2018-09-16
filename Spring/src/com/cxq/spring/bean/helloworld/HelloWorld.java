package com.cxq.spring.bean.helloworld;

public class HelloWorld {

	private String name;
	
	public HelloWorld() {
		System.out.println("HelloWorld's constructor...");
	}

	public String getName() {
		System.out.println("HelloWorld's getName...");
		return name;
	}

	public void setName(String name) {
		System.out.println("HelloWorld's setName...");
		this.name = name;
	}
	
	public void hello(){
		System.out.println("helloWorld:" + name);
	}
	
}
