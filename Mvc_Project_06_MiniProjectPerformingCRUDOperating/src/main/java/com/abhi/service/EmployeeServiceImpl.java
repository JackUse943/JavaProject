package com.abhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.Employee;
import com.abhi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> showReport() {
		List<Employee> all = employeeRepository.findAll();
		all.sort((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));
		return all;
	}

	@Override
	public String addEmployee(Employee employee) {
		Employee save = employeeRepository.save(employee);
		return "Employee Details inserted with " + save.getEmpId();
	}

}
