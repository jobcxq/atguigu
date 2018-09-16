package com.cxq.spring.bean.factoryBean;

import org.springframework.beans.factory.FactoryBean;

import com.cxq.spring.bean.vo.Car;

public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}	
	
	/**
	 * 返回bean实例
	 */
	@Override
	public Car getObject() throws Exception {
		return new Car(brand,50000);
	}

	/**
	 * 返回bean的类型
	 */
	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}

	/**
	 * 是否为单例
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}

}
