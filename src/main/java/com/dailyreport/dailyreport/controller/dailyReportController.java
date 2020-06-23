package com.dailyreport.dailyreport.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dailyreport.dailyreport.model.Customer;
import com.dailyreport.dailyreport.model.CustomerUI;
import com.dailyreport.dailyreport.repository.dailyreportRepository;

@RestController
public class dailyReportController {
	@Autowired

	dailyreportRepository repository;

//	@GetMapping("/dailyreport")
//	public String bulkcreate(){
//	      // save a single Customer
//	      repository.save(new Customer("Rajesh", "Bhojwani"));
//	      // save a list of Customers
//	      repository.saveAll(Arrays.asList(new Customer("Salim", "Khan")
//	                         , new Customer("Rajesh", "Parihar")
//	                         , new Customer("Rahul", "Dravid")
//	                         , new Customer("Dharmendra", "Bhojwani")));
//	      return "Customers are created";
//	  }

	@PostMapping("/create")
	public String create(@RequestBody List<CustomerUI> customer) {
		// save a single Customer
		for (CustomerUI customerUI : customer) {
			/*
			 * String firstName=customerUI.getFirstName(); String
			 * lastName=customerUI.getLastName(); String date=customerUI.getdate();
			 */
			Customer customerSave = repository
					.save(new Customer(customerUI.getFirstName(), customerUI.getLastName(), customerUI.getDate(),
							customerUI.getStatusDate(), customerUI.getClientName(), customerUI.getStatsDate()));

		}

		return "Data inserted into postgres DB";

	}

	@GetMapping("/findall")
	public List<CustomerUI> findAll() {
		List<Customer> customers = repository.findAll();
		List<CustomerUI> customerUI = new ArrayList<>();
		for (Customer customer : customers) {
			customerUI.add(new CustomerUI(customer.getFirstName(), customer.getLastName(), customer.getDate(),
					customer.getStatusDate(), customer.getClientName(), customer.getStatsDate()));
		}
		return customerUI;
	}

//	  @RequestMapping("/search/{id}")
//	  public String search(@PathVariable long id){
//	      String customer = "";
//	      customer = repository.findById(id).toString();
//	      return customer;
//	  }
//	  @RequestMapping("/searchbyfirstname/{firstname}")
//	  public List<CustomerUI> fetchDataByFirstName(@PathVariable String firstname){
//	      List<Customer> customers = repository.findByFirstName(firstname);
//	      List<CustomerUI> customerUI = new ArrayList<>();
//	      for (Customer customer : customers) {
//	      customerUI.add(new CustomerUI(customer.getFirstName(),customer.getLastName(),customer.getDate()));
//	      }
//	      return customerUI;
//	  }
}
