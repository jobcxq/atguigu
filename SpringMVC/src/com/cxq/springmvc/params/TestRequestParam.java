package com.cxq.springmvc.params;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("requestParam")
public class TestRequestParam {
	
	final static String SUCCESS = "com/cxq/springmvc/requestMapping/requestMapping";
	
	/**
	 * @RequestParam 来映射请求参数. value 值即请求参数的参数名 required 该参数是否必须. 默认为 true
	 *               defaultValue 请求参数的默认值
	 */
	@RequestMapping(value = "/requestParam")
	public String requestParam(
			@RequestParam(value = "username") String userName,
			@RequestParam(value = "age", required = false, defaultValue = "0") int age) {
		System.out.println("testRequestParam, username: " + userName + ", age: " + age);
		return SUCCESS;
	}

	
}
