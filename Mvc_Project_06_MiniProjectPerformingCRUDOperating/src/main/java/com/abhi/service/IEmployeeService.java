package com.abhi.service;

import java.util.List;
import com.abhi.entity.Employee;

public interface IEmployeeService {
	public List<Employee> showReport();
	public String addEmployee(Employee employee);
}
