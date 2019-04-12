package com.property.assignment.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.assignment.entity.Zone;
import com.property.assignment.repository.ZoneRepository;
import com.property.assignment.service.ZoneService;

@Service
public class ZoneServiceImpl implements ZoneService {
	
	@Autowired
	ZoneRepository zoneRepository;

	@Override
	public Zone insertZone(Zone zone) {
		return zoneRepository.save(zone);
		 
	}

	
	@Override
	public List<Zone> getAllZone() {
		return zoneRepository.findAll();
	}


	@Override
	public Optional<Zone> getZone(String id) {
		
		return zoneRepository.findById(id);
	}


	@Override
	public String deleteZone(String id) {
		zoneRepository.deleteById(id);
		return id;
	}
	
	

}