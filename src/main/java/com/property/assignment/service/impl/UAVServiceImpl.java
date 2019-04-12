package com.property.assignment.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.assignment.DTO.UAVDTO;
import com.property.assignment.entity.UAV;
import com.property.assignment.repository.UAVRepository;
import com.property.assignment.service.UAVService;

@Service
public class UAVServiceImpl implements UAVService{
	
	@Autowired
    UAVRepository uavRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public UAVDTO insertUAV(UAVDTO uav) {
		UAV entity = modelMapper.map(uav, UAV.class);
		UAV crtUAV= uavRepository.save(entity);
		return modelMapper.map(crtUAV, UAVDTO.class);
	}

	@Override
	public Optional<UAV> getUAV(String id) {
		return uavRepository.findById(id);
	}

	@Override
	public List<UAV> getAllUAV() {
		return uavRepository.findAll();
	}

	@Override
	public String deleteUAV(String id) {
		uavRepository.deleteById(id);
		return id;
	}

}
