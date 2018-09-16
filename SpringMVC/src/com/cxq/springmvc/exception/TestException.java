package com.cxq.springmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestException {
	
	final static String SUCCESS = "com/cxq/springmvc/exception/exception";
	final static String ERROR = "com/cxq/springmvc/exception/error";

	/*1.ExceptionHandlerExceptionResolver*/
	@RequestMapping("/exceptionHandlerExceptionResolver")
	public String exceptionHandlerExceptionResolver(@RequestParam("i") int i){
		System.out.println("result: " + (10 / i));
		return SUCCESS;
	}
	
	/**
	 * 1. 在 @ExceptionHandler 方法的入参中可以加入 Exception 类型的参数, 该参数即对应发生的异常对象
	 * 2. @ExceptionHandler 方法的入参中不能传入 Map. 若希望把异常信息传到页面上，需要使用 ModelAndView作为返回值
	 * 3. @ExceptionHandler 方法标记的异常有优先级的问题. 
	 * 4. @ControllerAdvice: 如果在当前 Handler 中找不到 @ExceptionHandler 方法来出来当前方法出现的异常, 
	 * 则将去 @ControllerAdvice 标记的类中查找 @ExceptionHandler 标记的方法来处理异常. 
	 */
	//声明数学异常
	@ExceptionHandler({ArithmeticException.class})
	public ModelAndView arithmeticException(Exception ex){
		System.out.println("出异常了[arithmeticException]: " + ex);
		ModelAndView mv = new ModelAndView(ERROR);
		mv.addObject("exception", ex);
		return mv;
	}
	
	//声明运行时异常
	@ExceptionHandler({RuntimeException.class})
	public ModelAndView runtimeException(Exception ex){
		System.out.println("出异常了[runtimeException]: " + ex);
		ModelAndView mv = new ModelAndView(ERROR);
		mv.addObject("exception", ex);
		return mv;
	}
	//声明@ControllerAdvice注解异常
	//TestExceptionHandler.java
	
	
	/*2.ResponseStatusExceptionResolver*/
	@ResponseStatus(reason="测试",value=HttpStatus.NOT_FOUND)
	//方法加异常，导致正常情况下也响应该异常
	@RequestMapping("/responseStatusExceptionResolver")
	public String responseStatusExceptionResolver(@RequestParam("i") int i){
		if(i == 13){
			throw new UserNameNotMatchPasswordException();
		}
		System.out.println("testResponseStatusExceptionResolver...");
		
		return SUCCESS;
	}
	//UserNameNotMatchPasswordException.java

	
	/*3.DefaultHandlerExceptionResolver*/
	@RequestMapping(value="/defaultHandlerExceptionResolver",method=RequestMethod.POST)
	public String defaultHandlerExceptionResolver(){
		System.out.println("testDefaultHandlerExceptionResolver...");
		return SUCCESS;
	}
	
	/*4.SimpleMappingExceptionResolver*/
	@RequestMapping("/simpleMappingExceptionResolver")
	public String simpleMappingExceptionResolver(@RequestParam("i") int i){
		String [] vals = new String[10];
		System.out.println(vals[i]);
		return SUCCESS;
	}
	
}
