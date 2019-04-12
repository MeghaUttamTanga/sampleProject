package com.property.assignment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="category", schema="propertytax")
public class Category implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3568162655727539106L;

	@Id
	@Column(name = "id", length=10, unique=true)
	String id;
	
	@Column(name= "name", length=10, nullable=false, unique=true)
	String name;
	
	@Column(name="PropertyDescription", length=255, nullable=false, unique=false)
	String PropertyDescription;

}
