package com.cxq.spring.bean.annotation.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cxq/spring/bean/annotation/generic/di/applicationContext.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		User user = new User();
		userService.add(user);
	}

}
