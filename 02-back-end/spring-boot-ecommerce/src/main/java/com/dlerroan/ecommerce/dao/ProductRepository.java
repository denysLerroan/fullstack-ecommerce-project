package com.dlerroan.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dlerroan.ecommerce.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
