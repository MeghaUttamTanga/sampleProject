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

import com.property.assignment.DTO.UAVDTO;
import com.property.assignment.entity.UAV;
import com.property.assignment.service.UAVService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags="UAV CARD operation")
public class UAVController {
	
	@Autowired
	UAVService uavService;
	
	@PostMapping("/propertytax/uavinsert/")
	@ApiOperation(value="insert data into UAV", notes="insert value into UAV", response=UAVDTO.class)
	public UAVDTO insertUAV(@RequestBody UAVDTO uav) {
		return uavService.insertUAV(uav);
	}
	
	@DeleteMapping("/propertytax/uavdelete/")
	@ApiOperation(value="delete record  from the UAV", notes="delte record from UAV for the given id", response=String.class)
	public String deleteUAV(@PathVariable String id )
	{
		return uavService.deleteUAV(id);
	}
	
	@GetMapping("/propertytax/uavgetall/")
	@ApiOperation(value="get all record from UAV", notes="fetch all records from UAV", response=UAVDTO.class)
	public List<UAV> getAllUAV() {
		return uavService.getAllUAV();
	}
	
	@GetMapping("/propertytax/uavget/")
	@ApiOperation(value="get recoed from the UAV for the given Id", notes="fetch the record from UAV for the given ID", response=UAV.class)
    public Optional<UAV> getUAV(@PathVariable String id)
    {
		return uavService.getUAV(id);
    }
}
