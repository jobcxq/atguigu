package com.cxq.spring.bean.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cxq.spring.bean.vo.Car;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/cxq/spring/bean/factory/applicationContext.xml");
		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1);
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
	}

}
