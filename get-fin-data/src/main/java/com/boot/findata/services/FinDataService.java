package com.boot.findata.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.findata.model.FinData;

@Service
public class FinDataService {
	@Autowired
	private FinDataRepository finDataRepository;
	public Optional<FinData> getFinData(String finId){
		return finDataRepository.findById(finId);
	}
}
