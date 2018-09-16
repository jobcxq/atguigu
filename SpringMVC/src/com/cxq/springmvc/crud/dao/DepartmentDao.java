package com.cxq.springmvc.crud.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cxq.springmvc.bean.Department;

public class DepartmentDao {

	private static Map<Integer, Department> departments = null;
	
	static{
		departments = new HashMap<Integer, Department>();
		
		departments.put(101, new Department(101, "财务部"));
		departments.put(102, new Department(102, "销售部"));
		departments.put(103, new Department(103, "产品部"));
		departments.put(104, new Department(104, "研发部"));
		departments.put(105, new Department(105, "活动部"));
	}
	
	public Collection<Department> getDepartments(){
		return departments.values();
	}
	
	public Department getDepartment(Integer id){
		return departments.get(id);
	}
	
}
