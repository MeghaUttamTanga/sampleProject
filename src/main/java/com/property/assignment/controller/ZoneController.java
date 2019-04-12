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

import com.property.assignment.entity.Status;
import com.property.assignment.entity.Zone;
import com.property.assignment.service.ZoneService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("Zone CURD Opertaion")
public class ZoneController {
	
	@Autowired
	ZoneService zoneService;
	
	@PostMapping("/propertytax/zoneinsert")
	@ApiOperation(value="insert value into Zone", notes="inser value into Zone", response=Zone.class)
	public Zone createZone (@RequestBody Zone zone) {
		return zoneService.insertZone(zone);
	}

	
	  @GetMapping("/propertytax/zoneget/{id}")
	  @ApiOperation(value="get value from Zone for the given id", notes="get value from Zone for the given id", response=Zone.class)
	  public Optional<Zone> getZone(@PathVariable String id)
	  {
		  return zoneService.getZone(id);
	  }
	  
	  @GetMapping("/propertytax/zonegetall")
	  @ApiOperation(value="get all value from Zone", notes="get all value from Zone", response=Zone.class)
	  public List<Zone> getAllZone()
	  {
		  return zoneService.getAllZone();
	  }
	  
	  @DeleteMapping("/propertytax/zonedelete/{id}")
	  @ApiOperation(value="delete value from Zone for the given id", notes="delete value from Zone for the given id", response=Status.class)
	  public String getDeleteZone(@PathVariable String id)
	  {
		  return zoneService.deleteZone(id);
	  }
}

