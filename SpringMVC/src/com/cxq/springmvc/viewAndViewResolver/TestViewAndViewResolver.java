package com.cxq.springmvc.viewAndViewResolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestViewAndViewResolver {
	
	final static String SUCCESS = "com/cxq/springmvc/view/viewAndViewResolver";
	
	@RequestMapping("/redirect")
	public String redirect(){
		System.out.println("testRedirect");
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/view")
	public String view(){
		System.out.println("testView");
		return "helloView";
	}
	
	@RequestMapping("/viewAndViewResolver")
	public String viewAndViewResolver(){
		System.out.println("test ViewAndViewResolver");
		return SUCCESS;
	}
	
}
