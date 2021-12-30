package com.example.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecom.Models.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    
}
