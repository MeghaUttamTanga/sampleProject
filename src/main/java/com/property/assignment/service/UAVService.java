package com.property.assignment.service;

import java.util.List;
import java.util.Optional;

import com.property.assignment.DTO.UAVDTO;
import com.property.assignment.entity.UAV;

public interface UAVService {
	
	public UAVDTO insertUAV(UAVDTO UAV);
	
	public Optional<UAV> getUAV(String id);
	
	public List<UAV> getAllUAV();
	
	public String deleteUAV(String id);

}
