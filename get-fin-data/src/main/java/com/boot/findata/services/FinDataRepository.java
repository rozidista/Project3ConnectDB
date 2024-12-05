package com.boot.findata.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.findata.model.FinData;

public interface FinDataRepository extends JpaRepository<FinData, String> {
	
}
