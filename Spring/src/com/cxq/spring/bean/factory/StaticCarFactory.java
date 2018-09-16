package com.cxq.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

import com.cxq.spring.bean.vo.Car;

/**
 * 静态工厂方法：直接调用某一个的静态方法返回bean的实例
 * @author Qin
 *
 */
public class StaticCarFactory {
	
	private static Map<String,Car> cars = new HashMap<String, Car>();
	
	static{
		cars.put("audi", new Car("audi", 30000));
		cars.put("ford", new Car("ford", 40000));
	}
	
	/**
	 * 静态工厂方法
	 * @param name
	 * @return
	 */
	public static Car getCar(String name){
		return cars.get(name);
	}
}
