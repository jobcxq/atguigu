package com.cxq.spring.bean.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cxq.spring.bean.helloworld.constructorArg.Car;

public class Main {
	
	public static void main(String[] args) {
		
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setUser("Tom");
//		helloWorld.hello(); 
		
		//1. 创建 Spring 的 IOC 容器:ctx
		//ApplicationContext：代表IOC容器
		//ClassPathXmlApplicationContext 是ApplicationContext接口的实现类，
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/cxq/spring/bean/helloworld/applicationContext.xml");
		
		//2. 从 IOC 容器中获取 bean 的实例
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");
		
		//根据类型来获取 bean 的实例: 要求在  IOC 容器中只有一个与之类型匹配的 bean, 若有多个则会抛出异常. 
		//一般情况下, 该方法可用, 因为一般情况下, 在一个 IOC 容器中一个类型对应的 bean 也只有一个. 
//		HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);
		
		//3. 使用 bean
		helloWorld.hello();
		
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car.toString());
		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1.toString());
		
	}
	
}
