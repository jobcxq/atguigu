package com.cxq.spring.bean.properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/cxq/spring/bean/properties/applicationContext.xml");
		BasicDataSource dataSource = (BasicDataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getUrl());
		System.out.println(dataSource.getUsername());
		System.out.println(dataSource.getPassword());
	}

}
