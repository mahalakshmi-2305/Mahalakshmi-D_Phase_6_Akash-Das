package com.healthcare.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.healthcare.app.model.Product;
import com.healthcare.app.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;
	
	public List<Product> getAllProduct(String keyword) {
		if(keyword!=null) {
			return productRepo.findAll(keyword);
		}
	return productRepo.findAll();
	}

	public void addProduct(Product product) {
		productRepo.save(product);
	}

	public void removeProductById(long id) {
		productRepo.deleteById(id);
	}

	public Optional<Product> getProductById(long id) {
		return productRepo.findById(id);
	}

	public List<Product> getAllProductsByCategoryId(int id) {
		return productRepo.findAllByCategory_Id(id);
	}

		
}
