package com.Springdemo.demo.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public List<Employee> getEmployee() {

		List<Employee> empList = new ArrayList();

		Employee arnab = new Employee();
		arnab.setId(1);
		arnab.setName("arnab");
		arnab.setSalary(50000);
		arnab.setDesignation("Software Engineer");

		Employee jubin = new Employee();
		jubin.setId(2);
		jubin.setName("jubin");
		jubin.setSalary(500000);
		jubin.setDesignation("Lead Developer");

		empList.add(arnab);
		empList.add(jubin);

		return empList;

	}
	
	

}
