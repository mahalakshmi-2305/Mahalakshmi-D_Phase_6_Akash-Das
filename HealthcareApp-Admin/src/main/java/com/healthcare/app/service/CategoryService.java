package com.healthcare.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.app.model.Category;
import com.healthcare.app.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepo;
	
	public List<Category> getAllCategory(){
		return categoryRepo.findAll();
	}
	
	public void addCategory(Category category) {
		categoryRepo.save(category);
	}
	
	public void removeCategory(int id) {
		categoryRepo.deleteById(id);
	}
	
	public Optional<Category> getCategoryById(int id){
		return Optional.of(categoryRepo.getById(id));
	}

}
