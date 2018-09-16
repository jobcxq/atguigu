package com.cxq.springmvc.viewAndViewResolver;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

/**
 *使用 @Component 将 HelloView 放入到IOC容器中。
 */
@Component
public class HelloView implements View{
	public String getContentType() {
		return "text/html";
	}

	public void render(Map<String, ?> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.getWriter().print("hello view, time: " + new Date());
	}
}
