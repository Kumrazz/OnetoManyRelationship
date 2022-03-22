package com.relation.onetomany.Relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.onetomany.Relationship.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
