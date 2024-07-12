package com.example.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.entity.studentece;
import com.example.university.service.ECEService;

@RequestMapping
@RestController
public class ECEController {
	@Autowired
	private ECEService eceService;

	@PostMapping
	public ResponseEntity<?> save(studentece student) {
		return eceService.createEce(student);

	}

	@GetMapping
	public ResponseEntity<?> get() {
		return eceService.getAll();

	}

	@PutMapping
	public ResponseEntity<?> update(studentece student,long id) {
		return eceService.updateEce(student,id);

	}

	@DeleteMapping
	public ResponseEntity<?> delete(long id) {
		return eceService.deleteEce(id);

	}

}
