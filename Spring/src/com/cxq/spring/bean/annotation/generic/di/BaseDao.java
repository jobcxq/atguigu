package com.cxq.spring.bean.annotation.generic.di;

public class BaseDao<T> {

	public void save(T entity){
		System.out.println("save:" + entity);
	}
	
}
