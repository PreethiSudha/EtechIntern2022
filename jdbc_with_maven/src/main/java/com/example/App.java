package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRepository;
import com.example.entity.Member;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   Connection con;
	       
    	   try {
	    	  
	    	   con = DriverManager.getConnection("jdbc:Oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
	    	   
	    	   System.out.println(con);
	    	   
	    	   LocalDate date = LocalDate.of(2022, 11, 28);
	    	   
	    	   Date sqlDate = Date.valueOf(date);
	    	   
	    	   LocalDate date2 = sqlDate.toLocalDate();
	    	   
	    	   MemberRepository mr = new MemberRepository(con);
	    	   
	    	   Member mem = new Member(201, "Preethukutty", "Navalur",  25000.00,  5, 200,
	    			   					LocalDate.of(2022, 11, 28), "Annual");
	    	   
	    	   int rowAdded = mr.add(mem);
	    	   
	    	   //mr.findAll().forEach(System.out::println);
	    	   
	    	   System.out.println("RowsAdded: =" +rowAdded);
	    	   
    	   }
    	   catch(SQLException e) {
    		   
    	   e.printStackTrace();
       }
    }
}
