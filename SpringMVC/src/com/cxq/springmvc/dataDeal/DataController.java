package com.cxq.springmvc.dataDeal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cxq.springmvc.bean.Employee;
import com.cxq.springmvc.crud.dao.EmployeeDao;

@Controller
public class DataController {

	@Autowired
	private EmployeeDao employeeDao;
	
	/**
	 * 测试自定义装换器
	 * conversionServiceConverer
	 */
	@RequestMapping("/conversionService")
	public String testConverter(@RequestParam("employee") Employee employee){
		System.out.println("save: " + employee);
		employeeDao.save(employee);
		return "redirect:/employeeList.do";
	}
}
