package com.property.assignment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="status", schema="propertytax")
public class Status implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6684847719239737209L;

	@Id
	@Column(length = 10, unique=true, nullable = false )
	String id;
	
	@Column(length =128, nullable = false)
	String name;

}
