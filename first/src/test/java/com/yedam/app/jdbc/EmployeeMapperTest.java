package com.yedam.app.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.yedam.app.emp.dao.Employee;
import com.yedam.app.emp.dao.EmployeeMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/*-context.xml"})
public class EmployeeMapperTest {
	
	@Autowired EmployeeMapper mapper;
	
	@Test
	public void findById() {
		Employee emp = new Employee();
		emp.setDepartmentId("50");
		emp.setManagerId("124");
		System.out.println(mapper.find(emp));
		System.out.println(mapper.find(emp).size());
		System.out.println(mapper.find(null).size());
	}
}
