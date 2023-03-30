package com.springboot.jpa.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.springboot.jpa.dto.User;


public interface UserDao extends CrudRepository<User, Integer> {

	public List<User> findByCity(String city);
	public List<User> findByNameAndCity(String name,String city);
	
	@Query("select u from User u")
	public List<User> getAllRecords();
	
	@Query("select u from User u where u.name=:n")	
	public List<User> getAllRecordByName(@Param("n") String name);
	
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getAllUsers();
}
