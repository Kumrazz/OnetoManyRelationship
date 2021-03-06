package com.relation.onetomany.Relationship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relation.onetomany.Relationship.dto.OrderRequest;
import com.relation.onetomany.Relationship.dto.OrderResponse;
import com.relation.onetomany.Relationship.entity.Customer;
import com.relation.onetomany.Relationship.repository.CustomerRepository;
import com.relation.onetomany.Relationship.repository.ProductRepository;

@RestController

public class OrderController {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepository.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInfo(){
		return customerRepository.getJoinInformation();
	}
}
