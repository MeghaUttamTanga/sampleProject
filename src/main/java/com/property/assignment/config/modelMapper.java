package com.property.assignment.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class modelMapper {
	
	@Bean
	public ObjectMapper objectMapperConfg() {
	ObjectMapper objectMapper = new ObjectMapper();
	return objectMapper;
	}
	
	@Bean
	public ModelMapper modelMapperConfg() {
		ModelMapper modelMapperObj = new ModelMapper();
	return modelMapperObj;
	}


}
