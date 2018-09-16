package com.cxq.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class TestExceptionHandler {
	
	final static String ERROR = "com/cxq/springmvc/exception/error";

	@ExceptionHandler({ArithmeticException.class})
	public ModelAndView arithmeticException(Exception ex){
		System.out.println("出异常了[@ControllerAdvice arithmeticException]: " + ex);
		ModelAndView mv = new ModelAndView(ERROR);
		mv.addObject("exception", ex);
		return mv;
	}
	
}
