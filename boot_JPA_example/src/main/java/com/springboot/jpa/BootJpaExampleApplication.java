package com.springboot.jpa;

import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.jpa.dao.UserDao;
import com.springboot.jpa.dto.User;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootJpaExampleApplication.class, args);

		UserDao userrespository = context.getBean(UserDao.class);

	//	User user = new User();

//		user.setName("Vedant Palwankar");
//		user.setCity("Beed");
//		user.setStatus("Y");
//		// Saving 1 user
//		User user1 = userrespository.save(user);
//		System.out.println(user1);
//		System.out.println(
//				"----------------------------------------------------------------------------------------------------------------------------------------------");
//		System.out.println("Saving Multiple user");
////		Saving Multiple user
//		
//		
//		User user2 = new User();
//		user2.setName("Sakshi kulkarni");
//		user2.setCity("Beed");
//		user2.setStatus("N");
//		
//		User user3 = new User();
//		user3.setName("Rucha kulkarni");
//		user3.setCity("Beed");
//		user3.setStatus("N");
//		
//		List<User> users = List.of(user2,user3);
//		
//		Iterable<User> result = userrespository.saveAll(users);
//		
//		result.forEach(u ->{
//			System.out.println(u);
//		});
//		
//		
		
		
		//UPDATE USER
		
//		Optional<User> optional = userrespository.findById(4);
//		
//		User user = optional.get();
//		System.out.println("User without Updation ----->  "+user);
//		
//		user.setName("Gautami Sarwadnya");
//		
//		userrespository.save(user);
//		System.out.println("User after Updation ----->  "+user);
//		
//		
//		
		
		//Fetching All data
		
//		Iterable<User> result = userrespository.findAll();
//		
//		result.forEach(u->{
//			System.out.println(u);
//		});
//	
		
		//Delete Single Record
		
//		userrespository.deleteById(2);
//		System.out.println("Record deleted...");
//		
		
		//Delete All Records
		
//		userrespository.deleteAll();
//		System.out.println("All Records deleted...");
//		

		
		//Custom Method without firing query
		
//		List<User> cityList =userrespository.findByCity("Beed");
//		
//		cityList.forEach(i->{
//			System.out.println(i);
//		});
//		
//		System.out.println("--------------------------------------------------------------------------------------");
//		
//		List<User> u = userrespository.findByNameAndCity("Riddhi Sanap", "Beed");
//		u.forEach(i->{
//			System.out.println(i);
//		});
//		
		
		//Custom Method by firing query
//		List<User> allRecords = userrespository.getAllRecords();
//		allRecords.forEach(i->{
//			System.out.println(i);
//		});
		
		
		//Custom Method by firing query
//		List<User> allRecordByName = userrespository.getAllRecordByName("Vedant V Palwankar");
//		allRecordByName.forEach(e->{
//			System.out.println(e);
//		});
//		
		
		//Custom Method by firing NATIVE query
		List<User> allUsers = userrespository.getAllUsers();
		allUsers.forEach(e->{
			System.out.println(e);
		});
		
	}
}