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
	
	public int delete(Employee emp)
	{
		String sql = "delete from emp11 where id ="+emp.getId()+" ";
		
		return jdbcTemplate.update(sql);
	}
	
	public List<Employee> listEmployees()
	{
		return jdbcTemplate.query("select * from emp11", new ResultSetExtractor<List<Employee>>()
				{
					public List<Employee>extractData(ResultSet rs) throws SQLException, DataAccessException
					{
						List<Employee> list = new ArrayList<Employee>();
						
						while(rs.next())
						{
							Employee e = new Employee();
							
							e.setId(rs.getInt(1));
							e.setName(rs.getString(2));
							e.setSalary(rs.getDouble(3));
							
							list.add(e);
						}
						return list;
					}
				});
	}

}
