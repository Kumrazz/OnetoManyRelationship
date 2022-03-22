package com.relation.onetomany.Relationship.dto;


import com.relation.onetomany.Relationship.entity.Customer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
	private Customer customer;
}
