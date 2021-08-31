package com.healthcare.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.healthcare.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByCategory_Id(int id);


	@Query("SELECT p FROM Product p WHERE p.name LIKE %?1%")
	List<Product> findAll(String keyword);
}
