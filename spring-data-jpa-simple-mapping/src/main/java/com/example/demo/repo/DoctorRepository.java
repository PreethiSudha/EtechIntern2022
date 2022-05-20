package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	public List<Doctor> findByDepartment(String dept);
	
	public List<Doctor> findById(int id);
	
	public Doctor findByDoctorName(String docName);
	
	public List<Doctor>
			findByDoctorNameAndDepartment(String docName, String dept);
	
	//nativeQuery = False, it is default
	@Query(nativeQuery = true,
			value = "select * from Preetz_Doctor " + "where doctor_name=:docName or department=:dept")
	public List<Doctor> getByName(@Param("docName") String docName,
							      @Param("dept") String dept);
	
}
