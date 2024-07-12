package com.example.university.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.entity.StudentCse;
import com.example.university.service.CSEService;

@RestController
@RequestMapping("/api/cse/students")
public class CSEController {
	@Autowired
	private CSEService cseService;
	
	@GetMapping
    public List<StudentCse> getAllStudents() {
        return cseService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<StudentCse>> getStudentById(@PathVariable Long id) {
        Optional<StudentCse> student = cseService.getStudentById(id);
        return ResponseEntity.ok().body(student);
    }

    @PostMapping
    public StudentCse createStudent(@RequestBody StudentCse studentCse) {
        return cseService.createStudent(studentCse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentCse> updateStudent(@PathVariable Long id, @RequestBody StudentCse studentCse) {
    	StudentCse updatedStudent = cseService.updateStudent(id, studentCse);
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
    	cseService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

}
