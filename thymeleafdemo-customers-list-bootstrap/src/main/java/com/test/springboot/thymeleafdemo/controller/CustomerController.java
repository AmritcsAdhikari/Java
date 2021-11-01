package com.test.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springboot.thymeleafdemo.model.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	
	private List<Customer> theCustomers;
	
	@PostConstruct
	private void loadData() {
		
		Customer cust1 = new Customer(1,"Amrit","Adhikari","amrit@test.com");
		Customer cust2 = new Customer(2,"Alex","Costa","alex@test.com");
		Customer cust3 = new Customer(3,"Aaron","Marino","aaron@test.com");
		Customer cust4 = new Customer(4,"Mark","Thompson","mark@test.com");
		
		theCustomers = new ArrayList<>();
		theCustomers.add(cust1);
		theCustomers.add(cust2);
		theCustomers.add(cust3);
		theCustomers.add(cust4);
		
	}
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
			theModel.addAttribute("customers", theCustomers);
			
			return "list-customers";
			
		}
}
	

