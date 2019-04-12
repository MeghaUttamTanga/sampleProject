package com.property.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.property.assignment.DTO.StatusDTO;
import com.property.assignment.entity.Status;

@Service
public interface StatusService {
	
	public StatusDTO insertStatus(StatusDTO statusDto);
	
	public Optional<Status> getStatus(String id);
	
	public List<Status> getAllStatus();
	
	public String deleteStatus(String id);
		
}


