package com.healthcare.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.app.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
