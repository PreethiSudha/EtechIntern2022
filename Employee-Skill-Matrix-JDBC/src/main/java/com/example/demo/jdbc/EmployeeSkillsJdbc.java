package com.example.demo.jdbc;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.EmployeeSkills;
import com.example.demo.ifaces.EmployeeSkillsRepository;

@Component
public class EmployeeSkillsJdbc implements EmployeeSkillsRepository {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public Object create(EmployeeSkills entity) {
		String createQuery = "CREATE TABLE pre_employee_skills_jdbc ("
				+	"    emp_skill_id int NOT NULL " 
				+   "	 emp_id  int "
				+   "	 skill_id  int "	
				+	"    skill_name  varchar(30)" 
				+	"    skill_experience  varchar(30)"
				+	"    status varchar(30)"
				+	"    approved_by varchar(30)"  
				+	"    approved_date date"  
				+	"    created_date date"  
				+	"    modified_date date"  
				+	"    PRIMARY KEY (emp_skill_id))"; 
		return template.queryForList(createQuery, entity);
	}
	
	@Override
	public List<EmployeeSkills> findAll() {
		String findAllQuery = "select * from pre_employee_skills_jdbc";
		return template.query(findAllQuery, BeanPropertyRowMapper.newInstance(EmployeeSkills.class));
	}

	//Api-4 
	@Override
	public Object add(EmployeeSkills entity) {
		String addQuery = "insert into pre_employee_skills_jdbc values(?,?,?,?,?,?,?,?,?,?)";
		return template.update(addQuery, entity.getEmpSkillId(),entity.getEmpId(),entity.getSkillId(),entity.getSkillName(),entity.getSkillExperience(),entity.getStatus(),
				entity.getApprovedBy(),entity.getApprovedDate(),entity.getCreatedDate(),entity.getModifiedDate());
	}

	public int updateBySkillName(EmployeeSkills entity) {
		String updateStatus = "update pre_employee_skills_jdbc set skill_name=? where emp_skill_id=?" ;
		return template.update(updateStatus, new Object[] {entity.getSkillName(),entity.getEmpSkillId()});
	}

	//API-7
	@Override
	public List<EmployeeSkills> searchBySkillNameAndExperience(String skillName, String experience) {
		String search2Query = "select * from pre_employee_skills_jdbc where skill_name=? and skill_experience=?";
		return template.query(search2Query, BeanPropertyRowMapper.newInstance(EmployeeSkills.class),skillName,experience);
	}

	//API-8
	@Override
	public List<EmployeeSkills> searchbyEmpNameOrApprovedByOrStatus(int empId, String approvedBy,String status) {
		String search3Query = "select * from pre_employee_skills_jdbc where emp_id=? or approved_by=? or status=?";
		return template.query(search3Query, BeanPropertyRowMapper.newInstance(EmployeeSkills.class),empId,approvedBy,status);
	}

	public List<EmployeeSkills> findByEmpId(int empId) {
		String empIdQuery = "select * from pre_employee_skills_jdbc where emp_id=?";
		return template.query(empIdQuery, BeanPropertyRowMapper.newInstance(EmployeeSkills.class),empId);
	}

	//APPI-5
	public List<EmployeeSkills> searchByStatusAndManagerId(String empName, String status) {
		String empSkillsQuery = "select esj.* from pre_emp_Ass_man_Jdbc eamj, pre_employee_skills_jdbc esj where manager_name=? and esj.status =? and eamj.emp_id=esj.emp_id";
		return template.query(empSkillsQuery, BeanPropertyRowMapper.newInstance(EmployeeSkills.class), new Object[] {empName,status});
		//return template.queryForList(empSkillsQuery, Employee_Skills.class, new Object[] {empName,status});	
	}

	//API-6
	public int updateEmpSkillsByManagerId(String status, String approvedBy, int empId , Date approvedDate) {
		String updateSkillsQuery = "update pre_employee_skills_jdbc set status = ?, approved_by = ?, approved_date = ? WHERE emp_id IN "
				+ "(select emp_id from pre_emp_Ass_man_Jdbc where manager_id = ?) and status = 'DRAFT'";
		return template.update(updateSkillsQuery,new Object[] {status,approvedBy,approvedDate,empId});
	}
	
}
