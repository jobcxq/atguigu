package com.cxq.spring.bean.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

	@Override
	public void getAllUser() {
		System.out.println("UserDaoImpl's getAllUser()...");
	}

}
