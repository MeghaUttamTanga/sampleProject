package com.property.assignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="UAV", schema="propertytax")
public class UAV {
	
	@Id
	private String id;
	
	
	@Column(name="uav", nullable=false, unique=true)
	private double uav;
	
	@Column(name="PropertyDescription", length=255, nullable=false)
	String PropertyDescription;
	
	@Column(name="zoneId", nullable=false)
	private String zoneId;
	
	@Column(name="statusId", nullable=false)
	private String statusId;
	
	@Column(name="categoryId", nullable=false)
	private String categoryId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="zoneId", referencedColumnName="id", insertable=false, updatable=false)
	private Zone zone;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="statusId", referencedColumnName="id", insertable=false, updatable=false)
	private Status status;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({@JoinColumn(name="categoryId", referencedColumnName="id", insertable=false, updatable=false),
			@JoinColumn(name="PropertyDescription", referencedColumnName="PropertyDescription", insertable=false, updatable=false)})
	private Category Category;
	

}
