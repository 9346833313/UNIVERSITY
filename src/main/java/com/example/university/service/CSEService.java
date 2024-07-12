package com.example.university.service;

import java.util.List;
import java.util.Optional;

import com.example.university.entity.StudentCse;


public interface CSEService {

	public List<StudentCse> getAllStudents() ;
		
	
    public Optional<StudentCse> getStudentById(Long id) ;
    	
    
    public StudentCse createStudent(StudentCse student) ;
		
    public StudentCse updateStudent(Long id, StudentCse studentDetails) ;
       

    public void deleteStudent(Long id) ;
        
    }