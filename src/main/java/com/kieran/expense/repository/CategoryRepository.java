package com.kieran.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kieran.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findByName(String name);
	
}
