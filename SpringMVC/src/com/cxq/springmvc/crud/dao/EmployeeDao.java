package com.cxq.springmvc.crud.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cxq.springmvc.bean.Department;
import com.cxq.springmvc.bean.Employee;

public class EmployeeDao {

	private static Map<Integer, Employee> employees = null;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	static{
		employees = new HashMap<Integer, Employee>();

		employees.put(1001, new Employee(1001, "陈小钦", "cxq@163.com", 1, new Department(101, "财务部")));
		employees.put(1002, new Employee(1002, "陈飞扬", "cfy@163.com", 1, new Department(102, "销售部")));
		employees.put(1003, new Employee(1003, "杨　胜", "ys@163.com", 0, new Department(103, "产品部")));
		employees.put(1004, new Employee(1004, "刘　凯", "lk@163.com", 0, new Department(104, "研发部")));
		employees.put(1005, new Employee(1005, "雷鹏超", "lpc@163.com", 1, new Department(105, "活动部")));
	}
	
	private static Integer initId = 1006;
	
	public void save(Employee employee){
		if(employee.getId() == null){
			employee.setId(initId ++);
		}
		
		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}
	
	public Collection<Employee> getAll(){
		return employees.values();
	}
	
	public Employee get(Integer id){
		return employees.get(id);
	}
	
	public void delete(Integer id){
		employees.remove(id);
	}
}
