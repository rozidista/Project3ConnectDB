package com.boot.findata.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.findata.services.FinDataRepository;
import com.boot.findata.services.FinDataService;
import com.boot.findata.model.FinData;

@RestController
@RequestMapping("/api/findata")
public class FinDataController {

	@Autowired
	private FinDataService finDataService;
	@GetMapping("/{finId}")
	public ResponseEntity<FinData> getFinData(@PathVariable String finId) {
		Optional<FinData> finDt = finDataService.getFinData(finId);
		return finDt.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	}

}
