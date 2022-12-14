package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee_Skills;
import com.example.demo.entity.Transaction_Log;
import com.example.demo.services.EmployeeSkillService;

@RestController
@RequestMapping(path="api/v1/empSkills")
public class EmployeeSkillsController {
		
	@Autowired
	private EmployeeSkillService empService;
	
	public EmployeeSkillsController(EmployeeSkillService empService) {
		super();
		this.empService = empService;
	}

	//Api-4 (By using jpa)
	@PostMapping(path="/add")
	public Employee_Skills add(@RequestBody Employee_Skills entity) {
		return this.empService.save(entity);
	}
	
	@GetMapping(path="/findAll")
	public List<Employee_Skills> findAll(){
		return this.empService.findAll();
	}
	
	@Autowired
	private JdbcTemplate template;
	 
	public void EmployeeSkillsRepo(JdbcTemplate template) {
		this.template = template;
	}
	
	//Api-4 (By using Jdbc)
	public int addByJdbc(Employee_Skills entity) {
		String sql = "insert into pre_emp_skills values(?,?,?,?,?,?,?,?,?,?,?)";
		return template.update(sql,entity.getEmpSkillsId(),entity.getEmpId(),entity.getSkillId(),entity.getSkillName(), 
				entity.getSkillType(), entity.getSkillExperience(), entity.getStatus(), entity.getApprovedBy(),
				entity.getApprovedDate(), entity.getCreatedDate(), entity.getModifiedDate());
	}
	
	public List<Employee_Skills> findAllByJdbc(){
		String sql = "select * from pre_emp_skills";
		return template.query(sql,BeanPropertyRowMapper.newInstance(Employee_Skills.class));	
	}
	
	public int updateByStatus(Employee_Skills entity) {
		String sql = "update pre_emp_skills set status =? where emp_skills_id=? or skill_name=?" ;
		//String sql = "update pre_emp_skills set status =? where emp_skills_id=?";
		return template.update(sql, new Object[] {entity.getStatus(),entity.getEmpSkillsId(),entity.getSkillName()});
		//return template.update(sql, new Object[] {entity.getStatus(),entity.getEmpSkillsId()});

	}
	
	public int updateBySkillName(Employee_Skills entity) {
		String sql = "update pre_emp_skills set status =? where skill_name=?";
		return template.update(sql, new Object[] {entity.getStatus(),entity.getSkillName()});
	}
	
	
	
	//Api-7 
	@GetMapping(path="/findBy/skillName/skillExp/{Name}/{Exp}")
	public List<Employee_Skills> findBySkillNameAndExperience(@PathVariable("Name") String name, 
			@PathVariable("Exp") String exp){
		return this.empService.findBySkillNameAndExperience(name,exp);
	}
	
	@GetMapping(path="/findBy/skillName/{Name}")
	public List<Employee_Skills> findBySkillName(@PathVariable("Name") String name){
		return this.empService.findBySkillName(name);
	}
	
	@GetMapping(path="/findBy/skillExp/{Exp}")
	public List<Employee_Skills> findBySkillExperience(@PathVariable("Exp") String exp){
		return this.empService.findBySkillExperience(exp);
	}
	
	
	
	//Api-8 (By using native sql queries)
	@GetMapping(path="/skillEmp/NameOrstatusOrApprovedBy",consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,
														produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee_Skills> searchByValue(@RequestParam("id") int id,  @RequestParam
			("status") String status, @RequestParam("approvedBy") String approvedBy){
	return  this.empService.searchByValue(id, status, approvedBy);
	}
	
	@GetMapping(path="/findBy/empId/{empId}")
	public List<Employee_Skills> findByEmployeeId(@PathVariable("empId") int id){
		return this.empService.findByEmployeeId(id);
	}
	
	@GetMapping(path="/findBy/Approver/{Name}")
	public List<Employee_Skills> findByApprover(@PathVariable("Name") String name){
		return this.empService.findByApprover(name);
	}
	
	@GetMapping(path="/findBy/Status/{status}")
	public List<Employee_Skills> findByStatus(@PathVariable("status") String status){
		return this.empService.findByStatus(status);
	}
	
	
	/* API - 5 */
	//GET Api to Fetching EmployeeSkills who are all associated with PROJECT MANAGER
	@GetMapping(path = "/manager/{empName}")
	public Object getEmployeeSkills(@PathVariable("empName") String empName){
		Object obj =empService.getEmployeeSkills(empName);
		empService.transactionstatus(empName, obj);
		return obj;
	}
	
	
	/* API - 6 */
	//GET Api to check whether the skill Status change from Draft to Approved once it met with Project Manager 
	@PutMapping("/updateStatus/{status}/{approvedBy}")
	public Object updateStatus (@PathVariable("status") String status,@PathVariable("approvedBy") String approvedBy) {
		Object obj = this.empService.updateStatus(status,approvedBy);
		empService.transactionstatus("status: " +status + "EmpName: "+approvedBy , obj);
		return obj;
	}
	
	// API To get the Transaction Log Details
	@GetMapping(path="/log")
	public List<Transaction_Log> getTransactionalLog(){
		return empService.getTransactionalLog();
	}
	
}

