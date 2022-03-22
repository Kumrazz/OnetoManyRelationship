package com.relation.onetomany.Relationship.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.relation.onetomany.Relationship.dto.OrderResponse;
import com.relation.onetomany.Relationship.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	@Query("select new com.relation.onetomany.Relationship.dto.OrderResponse( c.name,p.productName) From Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();
}
