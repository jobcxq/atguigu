package com.cxq.spring.bean.autowise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cxq.spring.bean.vo.Person;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/cxq/spring/bean/autowise/applicationContext.xml");
		Person p = (Person) ctx.getBean("person");
		System.out.println(p.toString());
	}

}
