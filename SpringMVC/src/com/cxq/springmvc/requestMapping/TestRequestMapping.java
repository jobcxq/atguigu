package com.cxq.springmvc.requestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/requestMapping")
public class TestRequestMapping {

	final static String SUCCESS = "com/cxq/springmvc/requestMapping/requestMapping";
	
	/**
	 * 使用 method 属性来指定请求方式
	 * @return
	 */
	@RequestMapping(value = "method", method = RequestMethod.POST)
	public String method(){
		System.out.println("testMethod");
		return SUCCESS;
	}
	
	/**
	 * 了解: 可以使用 params 和 headers 来更加精确的映射请求. params 和 headers 支持简单的表达式.
	 * 
	 * @return
	 */
	@RequestMapping(value = "paramsAndHeaders", params = { "username",
			"age!=10" }, headers = { "Accept-Language=en-US,zh;q=0.8" })
	public String paramsAndHeaders() {
		System.out.println("testParamsAndHeaders");
		return SUCCESS;
	}
	
	/**
	 * @PathVariable 可以来映射 URL 中的占位符到目标方法的参数中.
	 * @param id
	 * @return
	 */
	@RequestMapping("/pathVariable/{id}")
	public String pathVariable(@PathVariable("id") Integer id) {
		System.out.println("testPathVariable: " + id);
		return SUCCESS;
	}
}
