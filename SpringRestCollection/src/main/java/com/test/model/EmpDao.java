package com.test.model;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class EmpDao {
	
	private static Employees listEmpList = new Employees();
	
	static
	{
		listEmpList.getEmpList().add(new Employee(111, "Manohar", "EEE", "hyd"));
		listEmpList.getEmpList().add(new Employee(222, "Amit", "kumar", "blr"));
		listEmpList.getEmpList().add(new Employee(333, "Harika", "ECE", "CHENNAI"));
		listEmpList.getEmpList().add(new Employee(444, "Lakshmi", "IT", "Kolkata"));
		listEmpList.getEmpList().add(new Employee(555, "Gous", "Mulla", "Blr"));
		listEmpList.getEmpList().add(new Employee(666, "Sai", "prasad", "Hyd"));
	}
	
	public Employees getAllEmployees()
	{
		
		return listEmpList;
	}
	
	public void addEmployee(Employee employee)
	{
		listEmpList.getEmpList().add(employee);
	}
	
	public String deleteEmployee(Integer id)
	{
		for(int i = 0; i < listEmpList.getEmpList().size(); i++)
		{
			Employee emp = listEmpList.getEmpList().get(i);
			
			if(emp.getId().equals(id))
			{
				listEmpList.getEmpList().remove(i);
				System.out.println("Done delete");
				return "Deleted Successfully";
			}
		}
		
		return "Employee id not available";
	}
	
	public String updateEmployee(Employee emp)
	{
		for(int i = 0; i < listEmpList.getEmpList().size(); i++)
		{
			Employee emp1 = listEmpList.getEmpList().get(i);
			
			if(emp1.getId().equals(emp.getId()))
			{
				listEmpList.getEmpList().set(i, emp);
				System.out.println("Done updated");
				return "updated Successfully";
			}
		}
		
		return "Employee id not available";
	}
	

}
