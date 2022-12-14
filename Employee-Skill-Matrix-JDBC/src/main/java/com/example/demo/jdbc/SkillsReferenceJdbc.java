package com.example.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SkillsReference;
import com.example.demo.ifaces.SkillsReferenceRepository;

@RestController
public class SkillsReferenceJdbc implements SkillsReferenceRepository {

	@Autowired
	private JdbcTemplate template;
	
	public SkillsReferenceJdbc(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public Object create(SkillsReference entity) {
		String createQuery =  "CREATE TABLE pre_skills_ref_jdbc ("
				+	"    skill_id int NOT NULL " 
				+	"    skill_name  varchar(30) UNIQUE" 
				+	"    skill_type  varchar(30)" 
				+	"    created_by varchar(30)"  
				+	"    created_date date"  
				+	"    created_time date"  
				+	"    PRIMARY KEY (skill_id))"; 
		return template.queryForList(createQuery, entity);
	}

	@Override
	public int add(SkillsReference entity) {
		
		String addQuery = "insert into pre_skills_ref_jdbc values(?,?,?,?,?,?)";
		return template.update(addQuery, entity.getSkillId(), entity.getSkillName(),entity.getSkillType(),entity.getCreatedBy(),entity.getCreatedDate(),entity.getCreatedTime());
	}

	@Override
	public List<SkillsReference> findAll() {
		String findAllQuery = "select * from pre_skills_ref_jdbc";
		return template.query(findAllQuery, BeanPropertyRowMapper.newInstance(SkillsReference.class));
	}
	
//	//API-6
//	public Object updateEntity(String string, LocalDate now, String empName) {
//		Strintg updateEntityQuery = "update pre_emp_skills_jdbc esj" + 
//				"set status='APPROVED', approved_date=(Date.valueOf(LocalDate.now())), approved_by='Mano'" + 
//				"where status = 'DRAFT' and emp_designation_id=101";
//		return template.query(updateEntityQuery, BeanPropertyRowMapper.newInstance(Skills_Reference.class));
//	}

	public Object getEmpName() {
		String empNameQuery = "select created_by from pre_skills_ref_jdbc";
		return template.query(empNameQuery, BeanPropertyRowMapper.newInstance(SkillsReference.class));
	}

	public SkillsReference findByCreatorName() {
		String creatorQuery = "select created_by from pre_skills_ref_jdbc";
		return template.queryForObject(creatorQuery, BeanPropertyRowMapper.newInstance(SkillsReference.class));
	}

	
	

}
