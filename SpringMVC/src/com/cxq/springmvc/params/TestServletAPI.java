package com.cxq.springmvc.params;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestServletAPI {

	final static String SUCCESS = "com/cxq/springmvc/requestMapping/requestMapping";
	
	/**
	 * 可以使用 Serlvet 原生的 API
	 */
	@RequestMapping("/servletAPI")
	public void servletAPI(HttpServletRequest request,
			HttpServletResponse response, Writer out) throws IOException {
		System.out.println("testServletAPI, " + request + ", " + response);
		out.write("hello springmvc");
//		return SUCCESS;
	}
	
}
