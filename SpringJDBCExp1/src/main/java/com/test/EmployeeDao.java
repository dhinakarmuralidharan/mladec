package com.test;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
 
public class EmployeeDao {
private JdbcTemplate jdbcTemplate;
private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
 
public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
	this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
}
 
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
 
public void insertEmployee(Employee emp)
{
	String sql = "insert into employee1 (e_name,e_cmp, e_city) values (:e_name, :e_cmp, :e_city)";
	
	MapSqlParameterSource msl = new MapSqlParameterSource();
	
	msl.addValue("e_name", emp.getE_name());
	msl.addValue("e_cmp", emp.getE_cmp());
	msl.addValue("e_city", emp.getE_city());
	
	namedParameterJdbcTemplate.update(sql, msl);
}
public int createEmployee(Employee emp)
{
	String sql="insert into employee1(e_name,e_cmp,e_city) values('"+emp.getE_name()+"','"+emp.getE_cmp()+"','"+emp.getE_city()+"')";
	return jdbcTemplate.update(sql);
}
public int updateEmployee(Employee emp) {
	String sql="update employee1 set e_name='"+emp.getE_name()+"',e_cmp= '"+emp.getE_cmp()+"',e_city= '"+emp.getE_city()+"' where id = "+emp.getId();
	return jdbcTemplate.update(sql);
}
 
public int deleteEmployee(Employee emp)
{
	String sql ="delete from employee1 where id="+emp.getId();
	return jdbcTemplate.update(sql);
}
public List<Employee> getAllEmployees()
{
	return jdbcTemplate.query("select * from employee1", new ResultSetExtractor<List<Employee>>()
			{
 
				@Override
				public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
					List<Employee> listEmp=new ArrayList<>();
					while(rs.next())
					{
						Employee emp=new Employee();
						emp.setId(rs.getInt(1));
						emp.setE_name(rs.getString(2));
						emp.setE_cmp(rs.getString(3));
						emp.setE_city(rs.getString(4));
						listEmp.add(emp);
					}
					return listEmp;
				}
		
			});
}
}