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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.entity.ITStudent;
import com.example.university.service.ITService;

@RestController
@RequestMapping("/api/it/students")
public class ITController {

	@Autowired
	private ITService itService;
	
	@PostMapping()
	public ResponseEntity<ITStudent> saveEmployee(@RequestBody ITStudent itStudent) {
		return new ResponseEntity<ITStudent>(itService.saveITStudent(itStudent), HttpStatus.CREATED);
	}

	@GetMapping
	public List<ITStudent> getAllEmployees() {
		return itService.getAllItStudents();
	}

	@GetMapping("{id}")
	public ResponseEntity<ITStudent> getEmployeeById(@PathVariable("id") long id) {
		return new ResponseEntity<ITStudent>(itService.getItStudent(id), HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<ITStudent> updateEmployee(@PathVariable("id") long id, @RequestBody ITStudent itStudent) {
		return new ResponseEntity<ITStudent>(itService.updateItStudent(itStudent, id), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") long id) {
		itService.deleteItStudent(id);
		return new ResponseEntity<String>("sucessfully deleted", HttpStatus.OK);
	}
}
