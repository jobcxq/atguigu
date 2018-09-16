package com.cxq.springmvc.modelData;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cxq.springmvc.bean.User;

@Controller
@SessionAttributes(value={"user"},types=String.class)
public class TestSessionAttributes {

	final static String SUCCESS = "com/cxq/springmvc/modelData/modelData";
	
	/**
	 * @SessionAttributes 除了可以通过属性名指定需要放到会话中的属性外(实际上使用的是 value 属性值),
	 * 还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中(实际上使用的是 types 属性值)
	 * 
	 * 注意: 该注解只能放在类的上面. 而不能修饰放方法. 
	 */
	@RequestMapping("/sessionAttributes")
	public String testSessionAttributes(Map<String, Object> map){
		User user = new User("Tom", "123456", "tom@qq.com", 15);
		map.put("user", user);
		map.put("school", "hubei Unversity");
		return SUCCESS;
	}
	
}
