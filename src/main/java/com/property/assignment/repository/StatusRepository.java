package com.property.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.property.assignment.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, String> {

}
