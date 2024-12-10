package com.abhi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "emp_value_gen", initialValue = 5000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private int empId;
	@Column(length = 20)
	@NonNull
	private String empName;
	@Column(length = 20)
	@NonNull
	private String empEmail;
	@NonNull
	private Double empSalary;
	@Column(length = 20)
	@NonNull
	private String empDepartment="Finance";

}
