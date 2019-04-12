package com.property.assignment.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.assignment.entity.Category;
import com.property.assignment.repository.CategoryRepository;
import com.property.assignment.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category insertCategory(Category caregory) {
		return categoryRepository.save(caregory);
		 
	}

	@Override
	public Optional<Category> getCategory(String id) {
		return categoryRepository.findById(id);
		//return categoryRepository.getOne(id);
	}

	@Override
	public List<Category> getAllCategory() {
		
		return categoryRepository.findAll();
	}

	@Override
	public String deleteCategory(String id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
		return id;
	}
	
	
	

}

