package com.cxq.springmvc.international;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testi18n {

	@Autowired
	private ResourceBundleMessageSource messageSource;
	
	@RequestMapping("/i18n")
	public String testI18n(Locale locale){
		String val = messageSource.getMessage("i18n.username", null, locale);
		System.out.println(val); 
		return "com/cxq/springmvc/international/i18n";
	}
}
