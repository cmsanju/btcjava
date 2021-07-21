package com.test;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Employee emp)
	{
		String sql = "insert into 	employee1 values("+emp.getId()+",'"+emp.getName()+"', '"+emp.getCmp()+"')";
		
		return jdbcTemplate.update(sql);
	}
	
	public int update(Employee emp)
	{
		String sql = "update employee1 set name = '"+emp.getName()+"', company = '"+emp.getCmp()+"' where id = "+emp.getId()+" ";
		
		return jdbcTemplate.update(sql);
	}
	
	public int delete(Employee emp)
	{
		String sql = "delete from table where id = "+emp.getId()+"";
		
		return jdbcTemplate.update(sql);
	}

}
