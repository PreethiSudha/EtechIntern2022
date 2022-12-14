package com.example.demo.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee_Skills;

@Repository
public interface EmployeeSkillsRepo extends JpaRepository<Employee_Skills, Integer>,
											CrudRepository<Employee_Skills, Integer> {
	
	
	//API-7 queries
	@Query(nativeQuery=true, value = "select * from pre_emp_skills where skill_name=:name and skill_experience=:exp")
	public List<Employee_Skills> findBySkillNameAndExperience(@Param("name") String name, 
			@Param("exp") String exp);
	
	@Query(nativeQuery=true, value="select * from pre_emp_skills where skill_name=:skillName")
	public List<Employee_Skills> searchByName(@Param("skillName") String skillName);

	@Query(nativeQuery = true, value = "select * from pre_emp_skills where skill_experience=:experience")
	public List<Employee_Skills> searchByExp(@Param("experience") String skillExperience);

	//API-8 queries
	@Query(nativeQuery=true, value = "select * from pre_emp_skills where emp_id=?1 or status=?2 or approved_by=?3")
	public List<Employee_Skills> findByNameOrstatusOrApproved( int id, String status, String approvedBy);
	
	@Query(value = "select * from pre_emp_skills where emp_id=:id",nativeQuery = true)
	public List<Employee_Skills> findByEmployeeId(@Param("id")int id);

	@Query(nativeQuery=true, value = "select * from pre_emp_skills where approved_by=:name")
	public List<Employee_Skills> srchByApprover(@Param("name") String name);

	//API-8,6
	@Query(nativeQuery=true, value = "select * from pre_emp_skills where status=:status")
	public List<Employee_Skills> findByStatus(@Param("status") String status);

	//API-6 query
	@Modifying
    @Query(nativeQuery = true, value = "update pre_emp_skills set status = 'APPROVED',approved_date = :approvedDate WHERE emp_id IN " + 
    		"(select emp_id from pre_emp_asso_to_mngr where manager_id = :managerId) and status = :status")
    public int updateEmpSkillsByManagerId( @Param("status") String status,@Param("managerId") int managerId,@Param("approvedDate") Date approvedDate);

	//API-5
	@Query(nativeQuery = true, value="select es.* from pre_emp_asso_to_mngr eam, pre_emp_skills es"
			+ " where manager_name=:empName and status =:status and eam.emp_id=es.emp_id")
	public List<Employee_Skills> searchByStatusAndManagerId(String empName, String status);
	 

}









//+ "(select es.* from pre_emp_skills es, pre_emp_designation edes, pre_emp_details edet " 
//+ "where status='DRAFT' and edes.emp_designation_id=edet.emp_designation_id and edet.emp_id=es.emp_id)"
//+ "where status='DRAFT' and emp_designation_id=101

//select es.* from pre_emp_skills es, pre_emp_designation edes, pre_emp_details edet , pre_emp_asso_to_mngr eatm
//where edes.emp_designation_id=edet.emp_designation_id and es.emp_id=eatm.emp_id and  status='DRAFT';

//"select es.* from pre_emp_skills es, pre_emp_designation edes, pre_emp_details edet ,pre_emp_asso_to_mngr aetm"
//+ "where status='DRAFT' and edes.emp_designation_id=edet.emp_designation_id and (edet.emp_id=es.emp_id)==eatm.emp_id"

//select es.* "
//+ "from pre_emp_skills es, pre_emp_designation edes, pre_emp_details edet "
//+ "where status='DRAFT' and edes.emp_designation_id=edet.emp_designation_id and es.emp_id=edet.emp_id "

//@Query( nativeQuery = true, value ="select es.status, eatm.emp_id, eatm.emp_name "
//		+ "from  pre_emp_asso_to_mngr eatm, pre_emp_skills es "
//		+ "where eatm.emp_id=es.emp_id and eatm.manager_name=:empName and status=:status") 	
//public List<Employee_Skills> searchByStatusAndManagerId(@Param("empName")String empName, @Param("status") String status);

//@Query( nativeQuery = true, value ="update pre_emp_skills " 
//		+ "set status=:update, approved_date=:approvedDate, approved_by=:approvedBy "
//		+ "where status = 'DRAFT' and emp_designation_id=101 ")
//public String updateEntity(@Param("update")String update, 
//				@Param("approvedDate")LocalDate approvedDate, 
//				@Param("approvedBy")String approvedBy);


//API-5,6 query
//@Query(nativeQuery = true,value = "select * from pre_emp_skills where approved_by=:approvedBy")
//public List<Employee_Skills> getByApproved(@Param("approvedBy") String approvedBy);



