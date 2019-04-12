package com.property.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.property.assignment.entity.Zone;

@Service
public interface ZoneService {
	
	public Zone insertZone(Zone zone);
	
	public Optional<Zone> getZone(String id);
	
	public List<Zone> getAllZone();
	
	public String deleteZone(String id);

}

