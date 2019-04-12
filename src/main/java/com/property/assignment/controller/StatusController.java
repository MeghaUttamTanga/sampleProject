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

import com.property.assignment.DTO.StatusDTO;
import com.property.assignment.entity.Status;
import com.property.assignment.service.StatusService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("Status CURD Opertaion")
public class StatusController {
	
	@Autowired
	StatusService statusService;
	
	@PostMapping("/propertytax/status")
	@ApiOperation(value="insert value into Status", notes="inser value into Status", response=StatusDTO.class)
	public StatusDTO createStatus(@RequestBody StatusDTO statusDto) {
		return statusService.insertStatus(statusDto);
	}
	
	@GetMapping("/propertytax/Status/{id}")
	  @ApiOperation(value="get value from Status for the given id", notes="get value from Status for the given id", response=Status.class)
	  public Optional<Status> getStatus(@PathVariable String id)
	  {
		  return statusService.getStatus(id);
	  }
	  
	  @GetMapping("/propertytax/status")
	  @ApiOperation(value="get all value from Status", notes="get all value from Status", response=Status.class)
	  public List<Status> getAllStatus()
	  {
		  return statusService.getAllStatus();
	  }
	  
	  
	  @DeleteMapping("/propertytax/statusdelete/{id}")
	  @ApiOperation(value="delete value from status for the given id", notes="delete value from status for the given id", response=Status.class)
	  public String getDeleteStatus(@PathVariable String id)
	  {
		  return statusService.deleteStatus(id);
	  }

}

