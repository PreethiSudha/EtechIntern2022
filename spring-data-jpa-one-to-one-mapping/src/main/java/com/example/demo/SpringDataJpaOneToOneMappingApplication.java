package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.utils.SeminarUtils;

@SpringBootApplication
public class SpringDataJpaOneToOneMappingApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaOneToOneMappingApplication.class, args);
		
		SeminarUtils obj = ctx.getBean(SeminarUtils.class);
	
		//obj.create();
		
		obj.findAll();
		
		ctx.close();
		
	}
	
	@Bean
	public Seminar munna() {
		Seminar smnr =  new Seminar();	
		smnr.setId(6060);
		smnr.setName("Rasak Munna");
		smnr.setDuration(1);
		return smnr;
	}
	
	@Bean
	public Speaker rm() {
		return new Speaker(604, "ram Micset", "Dolby 5.7");
	}
	//one to one returns only one value 
	
//	@Bean
//	public Speaker dm() {
//		return new Speaker(602, "Devi Micset", "HD 3000");
//	}
//	
//	@Bean
//	public Speaker am() {
//		return new Speaker(601, "Asraf Micset", "Dolby 4.2");
//	}

}
