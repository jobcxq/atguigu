package com.cxq.spring.bean.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cxq.spring.bean.vo.Car;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/cxq/spring/bean/lifeCycle/applicationContext.xml");
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		ctx.close();
	}

}
