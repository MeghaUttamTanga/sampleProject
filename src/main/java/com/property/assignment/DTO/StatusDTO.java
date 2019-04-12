package com.property.assignment.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class StatusDTO {
	
	@NotBlank
	@Size(min=1, max=10)
	String id;
	
	@NotBlank
	@Size(min=1, max=255)
	String name;

}
