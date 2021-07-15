package com.test.controller;

import java.net.URI;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.test.model.EmpDao;
import com.test.model.Employee;
import com.test.model.Employees;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmpDao empDao;
	
	@GetMapping(path = "/", produces = "application/json")
	public Employees getEmployees()
	{
		
		return empDao.getAllEmployees();
	}
	
	@PostMapping(path = "/", consumes = "application/json")
	//@ResponseBody
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		Integer id = empDao.getAllEmployees().getEmpList().size() + 1;
		
		employee.setId(id);
		
		empDao.addEmployee(employee);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("{/id}")
				.buildAndExpand(employee.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping(path = "/{id}", produces = "application/json")
	//@ResponseBody
	public Employees deleteEmployee(@PathVariable("id") Integer id)
	{
		System.out.println(id);
		empDao.deleteEmployee(id);
		
		
		
		return empDao.getAllEmployees();
	}
	
	@PutMapping(path = "/{id}", consumes = "application/json")
	@ResponseBody
	public Employees updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee employee)
	{
		
		employee.setId(id);

		empDao.updateEmployee(employee);
		
		return empDao.getAllEmployees();
	}
	
	
}
