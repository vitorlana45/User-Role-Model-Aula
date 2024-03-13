package com.devsuperior.demo.repositories;

import com.devsuperior.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
