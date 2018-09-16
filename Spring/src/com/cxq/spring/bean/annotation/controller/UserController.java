package com.cxq.spring.bean.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cxq.spring.bean.annotation.service.IUserService;

@Controller
public class UserController {
	
	@Autowired(required=false)
	private IUserService uservice;
	
	public void getAllUser(){
		System.out.println("UserController's getAllUser()...");
		uservice.getAllUser();
	}
}
