package com.cxq.spring.bean.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cxq.spring.bean.vo.Car;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/cxq/spring/bean/relation/applicationContext.xml");
		Car c = (Car) ctx.getBean("subCar");
		System.out.println(c.toString());
	}

}
