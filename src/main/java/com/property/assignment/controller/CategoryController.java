package com.property.assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.property.assignment.entity.Category;
import com.property.assignment.service.CategoryService;
import com.property.assignment.service.StatusService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("Category CURD Opertaion")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	StatusService statusService;
	
	
	  @GetMapping("/propertytax/categoryget/{id}")
	  @ApiOperation(value="get value from Caretory for the given id", notes="get value from Category for the given id", response=Category.class)
	  public Optional<Category> getCategory(@PathVariable String id)
	  {
		  return categoryService.getCategory(id);
	  }
	  
	  @GetMapping("/propertytax/categorygetall/")
	  @ApiOperation(value="get all value from Caretory", notes="get all value from Category", response=Category.class)
	  public List<Category> getAllCategory()
	  {
		  return categoryService.getAllCategory();
	  }
	
	@PostMapping("/propertytax/categoryinsert")
	@ApiOperation(value="insert value into Caretory", notes="inser value into Category", response=Category.class)
	public Category createCategory (@RequestBody Category category) {
		return categoryService.insertCategory(category);
	}
	

  
  @DeleteMapping("/propertytax/categorydelete/{id}")
  @ApiOperation(value="delete value from Caretory for the given id", notes="delete value from Caretory for the given id", response=Category.class)
  public String getDeleteCategory(@PathVariable String id)
  {
	  return categoryService.deleteCategory(id);
  }


}
