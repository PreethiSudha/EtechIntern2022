package com.example.demo.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.ifaces.EmployeeDesignationRepository;

@Component
public class EmployeeDesignationJdbc implements EmployeeDesignationRepository {
	
	@Autowired
	private JdbcTemplate template;
	
	public EmployeeDesignationJdbc(JdbcTemplate template) {
		super();
		this.template = template;
	}
	
	@Override
	public Object create(EmployeeDesignation entity) {
		String createQuery = "create table pre_emp_designation_jdbc (emp_designation_id number(10) PRIMARY KEY, emp_designation varchar(25))";
		return template.queryForList(createQuery, entity);
	}

	@Override
	public int add(EmployeeDesignation entity) {
		String addQuery = "insert into pre_emp_designation_jdbc values(?,?)";
		return template.update(addQuery, entity.getEmpDesignationId(), entity.getEmpDesignation());
	}

	@Override
	public List<EmployeeDesignation> findAll() {
		String findAllQuery = "select * from pre_emp_designation_jdbc";
		return template.query(findAllQuery, BeanPropertyRowMapper.newInstance(EmployeeDesignation.class));
	}
	
	//API-3,5,6
	public EmployeeDesignation findByDesId(int empDesId) {
		EmployeeDesignation designation = null;
		try {
			String sql = "select * from pre_emp_designation_jdbc Where emp_designation_id=?";
			designation = template.queryForObject(sql,BeanPropertyRowMapper.newInstance(EmployeeDesignation.class), empDesId);
		} catch (Exception ex) {
			System.out.println("Exception : " + ex);
		}
		return designation;
	}
	
	//API-2
	public Optional<EmployeeDesignation> findByDesgId(int empDesId) {
		Optional<EmployeeDesignation> check = Optional.empty();
		try {
			/**way 1**/
//			String desgQuery = "select * from pre_emp_designation_jdbc Where emp_designation_id=?";
//			EmployeeDesignation sql = template.queryForObject(desgQuery, BeanPropertyRowMapper.newInstance(EmployeeDesignation.class),empDesId);
			/**way 2**/
			EmployeeDesignation sql = template.queryForObject("select * from pre_emp_designation_jdbc Where emp_designation_id=?", BeanPropertyRowMapper.newInstance(EmployeeDesignation.class),empDesId);
			check=Optional.of(sql);
			return check;
		}catch(Exception e){
			System.out.println("Exception caught as : " +e);
		}
		return  check;
	}

}
