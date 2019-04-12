package com.property.assignment.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.assignment.DTO.StatusDTO;
import com.property.assignment.entity.Status;
import com.property.assignment.repository.StatusRepository;
import com.property.assignment.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {
	
	@Autowired
	StatusRepository statusRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	@Override
	public StatusDTO insertStatus(StatusDTO statusDto) {
		Status entity = modelMapper.map(statusDto, Status.class);
		Status crtStatus = statusRepository.save(entity);
		return modelMapper.map(crtStatus, StatusDTO.class);	 
	}

	@Override
	public Optional<Status> getStatus(String id) {
		return statusRepository.findById(id);
	}

	@Override
	public List<Status> getAllStatus() {
		return statusRepository.findAll();
	}

	@Override
	public String deleteStatus(String id) {
		statusRepository.deleteById(id);
		return id;
	}
	
	

}
