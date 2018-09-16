package com.cxq.spring.bean.annotation.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

	@Autowired	//子类可以继承该注解
	protected BaseDao<T> dao;
	
	public void add(T entity){
		//打印的 dao 为子类的实现
		System.out.println("add dao:" + dao);
		dao.save(entity);
	}
	
}
