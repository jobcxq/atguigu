package com.cxq.springmvc.dataDeal;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.cxq.springmvc.bean.Department;
import com.cxq.springmvc.bean.Employee;

/**
 * 自定义数据装换器
 * @author Qin
 *
 */
@Component
public class EmployeeConverter implements Converter<String, Employee> {

	public Employee convert(String source) {
		if(source != null){
			String [] vals = source.split("-");
			if(vals != null && vals.length == 4){
				String lastName = vals[0];
				String email = vals[1];
				Integer gender = Integer.parseInt(vals[2]);
				Department department = new Department();
				department.setId(Integer.parseInt(vals[3]));
				
				Employee employee = new Employee(null, lastName, email, gender, department);
				System.out.println(source + "--convert--" + employee);
				return employee;
			}
		}
		return null;
	}

}
