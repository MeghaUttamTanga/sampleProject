package com.property.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.property.assignment.entity.Category;

@Service
public interface CategoryService {
	
	public Category insertCategory(Category caregory);
	
	public Optional<Category> getCategory(String id);
	
	public List<Category> getAllCategory();

	public String deleteCategory(String id);
}
