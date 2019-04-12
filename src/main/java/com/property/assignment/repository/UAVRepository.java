package com.property.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.property.assignment.entity.UAV;

@Repository
public interface UAVRepository extends JpaRepository<UAV, String> {
	

}
