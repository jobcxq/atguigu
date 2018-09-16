package com.cxq.spring.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cxq.spring.bean.annotation.controller.UserController;
import com.cxq.spring.bean.annotation.dao.IUserDao;
import com.cxq.spring.bean.annotation.service.IUserService;
import com.cxq.spring.bean.annotation.vo.User;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/cxq/spring/bean/annotation/applicationContext.xml");
		
		User user = (User) ctx.getBean("user");
		System.out.println(user);
		
		IUserDao userDao = (IUserDao) ctx.getBean("userDaoImpl");
		System.out.println(userDao);
		
		//修改了bean的名称
		IUserService userService = (IUserService) ctx.getBean("userService");
		System.out.println(userService);
		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		
		System.out.println("=============组件装配============");
		userController.getAllUser();
		
	}

}
