package com.property.assignment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ZoneStatusCategoryId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 319888736530942029L;

	@Column(length=10, unique=true, nullable=false)
	String zoneId;
	
	@Column(length=10, unique=true, nullable=false)
	String statusId;
	
	@Column(length=10, unique=true, nullable=false)
	String categoryId;

}
