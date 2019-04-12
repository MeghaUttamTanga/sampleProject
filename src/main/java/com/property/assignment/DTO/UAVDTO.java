package com.property.assignment.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class UAVDTO {
	

	@NotBlank
	@Size(min=1, max=10)
	private String id;
	
	
	@NotBlank
	@Size(min=1, max=10)
	private double uav;
	
	@NotBlank
	@Size(min=1, max=255)
	String PropertyDescription;
	
	@NotBlank
	@Size(min=1, max=10)
	private String zoneId;
	
	
	@NotBlank
	@Size(min=1, max=10)
	private String statusId;
	
	
	@NotBlank
	private String categoryId;

}
