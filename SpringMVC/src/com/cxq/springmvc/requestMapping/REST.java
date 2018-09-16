package com.cxq.springmvc.requestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rest")
public class REST {
	
	final static String SUCCESS = "com/cxq/springmvc/requestMapping/requestMapping";
	
	/**
	 * Rest 风格的 URL. 以 CRUD 为例: 新增: /order POST 修改: /order/1 PUT update?id=1 获取:
	 * /order/1 GET get?id=1 删除: /order/1 DELETE delete?id=1
	 * 
	 * 如何发送 PUT 请求和 DELETE 请求呢 ? 1. 需要配置 HiddenHttpMethodFilter 2. 需要发送 POST 请求
	 * 3. 需要在发送 POST 请求时携带一个 name="_method" 的隐藏域, 值为 DELETE 或 PUT
	 * 
	 * 在 SpringMVC 的目标方法中如何得到 id 呢? 使用 @PathVariable 注解
	 * 
	 */
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public String put(@PathVariable Integer id) {
		System.out.println("testRest Put: " + id);
		return SUCCESS;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer id) {
		System.out.println("testRest Delete: " + id);
		return SUCCESS;
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String post() {
		System.out.println("testRest POST");
		return SUCCESS;
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public String get(@PathVariable Integer id) {
		System.out.println("testRest GET: " + id);
		return SUCCESS;
	}
}
