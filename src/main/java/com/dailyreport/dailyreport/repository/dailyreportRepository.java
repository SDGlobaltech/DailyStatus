package com.dailyreport.dailyreport.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.dailyreport.dailyreport.model.Customer;
@Repository
public interface dailyreportRepository extends CrudRepository<Customer, Long> {
	
	List<Customer> findByFirstName(String FirstName);
	//List<Customer> findCustomers(String date);
	List<Customer> findAll();

}
