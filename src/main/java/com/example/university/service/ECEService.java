package com.example.university.service;

import org.springframework.http.ResponseEntity;

import com.example.university.entity.studentece;

public interface ECEService {
	ResponseEntity<?> createEce(studentece student);

	public ResponseEntity<?> getAll();

	public ResponseEntity<?> updateEce(studentece student,long id);

	public ResponseEntity<?> deleteEce(long id);

	

	
}
