package com.example.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.bean.ResponseBean;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.ifaces.EmployeeDetailsRepository;

@Component
public class EmployeeDetailsJdbc implements EmployeeDetailsRepository {

	@Autowired
	private JdbcTemplate template;
	
	public EmployeeDetailsJdbc(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public Object create(EmployeeDetails entity) {
		String createQuery = "CREATE TABLE pre_emp_details_jdbc ("
			+	"    emp_id int NOT NULL " 
			+	"    emp_name  varchar(30)" 
			+	"    emp_designation_id  int"  
			+	"    emp_date_Of_Joining date"  
			+	"    PRIMARY KEY (emp_id)"  
			+	"    FOREIGN KEY (emp_des_id) REFERENCES pre_emp_designation_jdbc (emp_des_id))"; 
		return template.queryForList(createQuery, entity);
	}
	
	//API-2
	@Override
	public Object add(EmployeeDetails entity) {
		String addQuery = "insert into pre_emp_details_jdbc values(?,?,?,?)";
		return template.update(addQuery, entity.getEmpId(),entity.getEmpName(),entity.getEmpDesignationId(),entity.getEmpDateOfJoining());
	}

	@Override
	public Object update(EmployeeDetails entity) {
		String updateQuery = "update pre_emp_details_jdbc set emp_name =? where emp_id = ?";
		return template.update(updateQuery, new Object[] {entity.getEmpName(), entity.getEmpId()});
	}

	@Override
	public List<EmployeeDetails> findAll() {
		String findAllQuery = "select * from pre_emp_details_jdbc";
		return template.query(findAllQuery,BeanPropertyRowMapper.newInstance(EmployeeDetails.class));
	}

	//API-2
	public List<ResponseBean> getEmployee(String empName , String empDesignation ){
		String getEmpQuery = "select emp_name, emp_designation from pre_emp_details_jdbc edetj, pre_emp_designation_jdbc edesj "
								+ "where edetj.emp_designation_id = edesj.emp_designation_id";
		return template.query(getEmpQuery, BeanPropertyRowMapper.newInstance(ResponseBean.class));
	}
	
	
	//API-3
	@Override
	public EmployeeDetails findByEmpName(Object empName) {
//		List<Employee_Details> empdetails = null;
//		try {
//			String empdetailsQuery = "select * from pre_emp_details_jdbc where emp_name=?";
//			empdetails = template.query(empdetailsQuery, BeanPropertyRowMapper.newInstance(Employee_Details.class));
//			return (Employee_Details) empdetails;
//		}catch (Exception ex) {
//			System.out.println("Exception occurs as : " +ex);
//		}
//		return (Employee_Details) empdetails;
		
		String emplNameQuery ="select * from pre_emp_details_jdbc where emp_name=?";
		return template.queryForObject(emplNameQuery, BeanPropertyRowMapper.newInstance(EmployeeDetails.class),empName);
		
	}

	//API-5,6
	public EmployeeDetails searchByEmpName(String empName) {
//		Employee_Details empdetails=null;
//		try {
//		String empNameQuery ="select edetj.* from pre_emp_details_jdbc edetj, pre_emp_Ass_man_Jdbc eamj where edetj.emp_name=eamj.emp_name";
//		empdetails = template.queryForObject(empNameQuery, BeanPropertyRowMapper.newInstance(Employee_Details.class));
//		System.out.println("Employee Details are : " +empdetails);
//		}catch(Exception ex) {
//		System.out.println("Exception occurs as : " +ex);
//		}
//		return empdetails;
		
		String empNameQuery ="select * from pre_emp_details_jdbc where emp_name=?";
		return template.queryForObject(empNameQuery, BeanPropertyRowMapper.newInstance(EmployeeDetails.class),empName);
	}

	//API-2 for getting manager - TRIAL
	public List<ResponseBean> addEmployee(EmployeeDetails entity) {
		String getEmpQuery = "select * from pre_emp_details_jdbc edetj, pre_emp_designation_jdbc edesj"  
				+ " where edetj.emp_designation_id = edesj.emp_designation_id"
				+ " and edesj.emp_designation='Project Manager'";
		return template.query(getEmpQuery, BeanPropertyRowMapper.newInstance(ResponseBean.class));
	}

	//API-2 for getting all the employees associated with manager - TRIAL
	public List<ResponseBean> addEmp(EmployeeDetails entity) {
		String addEmpQuery = "select * from pre_emp_details_jdbc edetj, pre_emp_Ass_man_Jdbc eamj"
				+ " where edetj.emp_id = eamj.emp_id";
		return template.query(addEmpQuery, BeanPropertyRowMapper.newInstance(ResponseBean.class));
	}

	
	public ResponseBean getEmpDetails(int empDesignationId) {
		String desgQuery = "select * from pre_emp_designation_jdbc where emp_designation_id = ?";
		return template.queryForObject(desgQuery, BeanPropertyRowMapper.newInstance(ResponseBean.class),empDesignationId);
	}

	
	
}



















