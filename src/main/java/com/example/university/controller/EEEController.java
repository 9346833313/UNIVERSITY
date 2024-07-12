package com.example.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.university.entity.EEE;
import com.example.university.service.EEEService;

public class EEEController {
	@Autowired
	private EEEService eeeService;

	@PostMapping
	public ResponseEntity<EEE> createEEE(@RequestBody EEE eee) {
		EEE savedEEE = eeeService.createEEE(eee);
		return new ResponseEntity<>(savedEEE, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<EEE> getEEEById(@PathVariable("id") Long eeeId) {
		EEE eee = eeeService.getEEEById(eeeId);
		return new ResponseEntity<>(eee, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<EEE>> getAllEEE() {
		List<EEE> eees = eeeService.getAllEEE();
		return new ResponseEntity<>(eees, HttpStatus.OK);
	}

	@PutMapping("{id}")

	public ResponseEntity<EEE> updateEEE(@PathVariable("id") Long eeeId, @RequestBody EEE eee) {
		eee.setId(eeeId);
		EEE updatedEEE = eeeService.updateEEE(eee);
		return new ResponseEntity<>(updatedEEE, HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEEE(@PathVariable("id") Long eeeId) {
		eeeService.deleteEEE(eeeId);
		return new ResponseEntity<>("EEE Id successfully deleted!", HttpStatus.OK);
	}
}