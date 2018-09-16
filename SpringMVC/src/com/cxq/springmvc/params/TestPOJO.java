package com.cxq.springmvc.params;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cxq.springmvc.bean.User;

@Controller
public class TestPOJO {

	final static String SUCCESS = "com/cxq/springmvc/requestMapping/requestMapping";
	
	/**
	 * Spring MVC 会按请求参数名和 POJO 属性名进行自动匹配， 自动为该对象填充属性值。支持级联属性。
	 * 如：dept.deptId、dept.address.tel 等
	 */
	@RequestMapping("/pojo")
	public String testPojo(User user) {
		System.out.println("testPojo: " + user);
		return SUCCESS;
	}
	
}
