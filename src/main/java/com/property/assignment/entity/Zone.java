package com.property.assignment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="zone", schema="propertytax")
public class Zone implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1074448773898927099L;

	@Id
	@Column(length=10, unique=true, nullable=false)
	String id;
	
	@Column(length=128, nullable=false)
	String name;
	
}
