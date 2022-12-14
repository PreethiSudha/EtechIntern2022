package com.example.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.EmployeeAssociateManager;
import com.example.demo.ifaces.EmpAssManRepository;

@Component
public class EmpAssManJdbc implements EmpAssManRepository {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public Object create(EmployeeAssociateManager entity) {
		String createQuery = "CREATE TABLE pre_emp_Ass_man_Jdbc ( "
			+	"  emp_id int NOT NULL " 
			+	"  emp_name varchar(30) "
			+	"  manager_id int "
			+   "  manager_name varchar(30) "
			+	"  PRIMARY KEY(emp_id))";
		return template.queryForList(createQuery, entity);
	}

	@Override
	public int add(EmployeeAssociateManager entity) {
		String addQuery = "insert into pre_emp_Ass_man_Jdbc values(?,?,?,?)";
		return template.update(addQuery, entity.getEmpId(),entity.getEmpName(),entity.getManagerId(),entity.getManagerName());
	}

	@Override
	public List<EmployeeAssociateManager> findAll() {
		String findAllQuery = "select * from pre_emp_Ass_man_Jdbc";
		return template.query(findAllQuery,BeanPropertyRowMapper.newInstance(EmployeeAssociateManager.class));
	}

}
