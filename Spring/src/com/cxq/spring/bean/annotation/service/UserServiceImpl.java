package com.cxq.spring.bean.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxq.spring.bean.annotation.dao.IUserDao;

//("userService") ：指定bean的名称
@Service("userService")
public class UserServiceImpl implements IUserService {

	private IUserDao userDao;
	
	@Autowired
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void getAllUser() {
		System.out.println("UserServiceImpl's getAllUser()...");
		userDao.getAllUser();
	}

}
