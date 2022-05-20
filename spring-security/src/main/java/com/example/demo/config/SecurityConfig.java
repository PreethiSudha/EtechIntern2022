package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	BCryptPasswordEncoder encoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
       
		//		auth.inMemoryAuthentication()
//		.withUser("India").password(encoder.encode("India")).roles("ADMIN")
//		.and()
//		.withUser("China").password(encoder.encode("China")).roles("GUEST");
//		
		String sql = "select u.username , a.authority "
				+ "FROM Preethi_authorities a, Preethi_users u "
				+ " WHERE u.username = ? "
				+ "AND u.username = a.username";
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery("select username, password, "
				+ "enabled from Preethi_users where username = ? ")
		.authoritiesByUsernameQuery(sql)
		.passwordEncoder(encoder);
		
	}
		
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
			.antMatchers("/api/v1/**")
				.authenticated()
					.and()
						.httpBasic();
		//it is httpbasic authentication
		//by that internally authorizaton will be save as a part of the headers in postman
	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.authorizeHttpRequests()
//			.antMatchers("/api/v1/**")
//				.authenticated()
//					.and()
//						.formLogin();
//		//it is formlogin authentication
//	}

}
