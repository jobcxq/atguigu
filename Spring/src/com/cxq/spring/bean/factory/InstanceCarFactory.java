package com.cxq.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

import com.cxq.spring.bean.vo.Car;

/**
 * 实例工厂方法：实例工厂的方法，先创建工厂本身，再通过调用工厂的实例方法来返回bean实例
 * @author Qin
 *
 */
public class InstanceCarFactory {

	private Map<String,Car> cars = null;
	
	public InstanceCarFactory() {
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("audi", 30000));
		cars.put("ford", new Car("ford", 40000));
	}
	
	public Car getCar(String name){
		return cars.get(name);
	}
}
