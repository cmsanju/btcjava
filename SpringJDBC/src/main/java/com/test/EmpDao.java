package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int save(Employee e)
	{
		String sql = "insert into employee values ("+e.getId()+", '"+e.getName()+"','"+e.getSalary()+"')";
		
		return jdbcTemplate.update(sql);
	}
	
	public int update(Employee e)
	{
		String sql = "update employee set name = '"+e.getName()+"', salary = '"+e.getSalary()+"' where id = "+e.getId()+"";
		
		return jdbcTemplate.update(sql);
	}

}
