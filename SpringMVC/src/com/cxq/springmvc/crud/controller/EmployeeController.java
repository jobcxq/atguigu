package com.cxq.springmvc.crud.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cxq.springmvc.bean.Employee;
import com.cxq.springmvc.crud.dao.DepartmentDao;
import com.cxq.springmvc.crud.dao.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;

	@ModelAttribute
	public void getEmployee(@RequestParam(value="id",required=false) Integer id,
			Map<String, Object> map){
		if(id != null){
			map.put("employee", employeeDao.get(id));
		}else{
			Employee employee = new Employee();
			map.put("employee", employee);
		}
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.PUT)
	public String update(Employee employee){
		employeeDao.save(employee);
		
		return "redirect:/employeeList.do";
	}
	
	@RequestMapping(value="/employee/{id}", method=RequestMethod.GET)
	public String input(@PathVariable("id") Integer id, Map<String, Object> map){
		map.put("employee", employeeDao.get(id));
		map.put("departments", departmentDao.getDepartments());
		return "com/cxq/springmvc/crud/employee";
	}
	
	@RequestMapping(value="/employee/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id){
		employeeDao.delete(id);
		return "redirect:/employeeList.do";
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.POST)
	public String save(Employee employee, Map<String, Object> map){
		map.put("departments", departmentDao.getDepartments());
		System.out.println(employee);
		employeeDao.save(employee);
		return "redirect:/employeeList.do";
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public String input(Map<String, Object> map){
		map.put("departments", departmentDao.getDepartments());
		map.put("employee", new Employee());
		return "com/cxq/springmvc/crud/employee";
	}
	
	@RequestMapping("/employeeList")
	public String list(Map<String, Object> map){
		map.put("employees", employeeDao.getAll());
		return "com/cxq/springmvc/crud/employeeList";
	}
	
	/**
	 * 不自动绑定对象中的lastName属性
	 * @param binder
	 */
//	@InitBinder
//	public void initBinder(WebDataBinder binder){
//		binder.setDisallowedFields("lastName");
//	}
	
}
