package com.example.university.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.entity.StudentCse;
import com.example.university.repository.CSERepository;
import com.example.university.service.CSEService;

@Service
public class CSEServiceimpl implements CSEService {

	@Autowired
	private CSERepository cseRepository;

	@Override
	public List<StudentCse> getAllStudents() {
		return cseRepository.findAll();
	}

	@Override
	public Optional<StudentCse> getStudentById(Long id) {
		return cseRepository.findById(id);
	}

	@Override
	public StudentCse createStudent(StudentCse student) {
		return cseRepository.save(student);

	}

	@Override
	public StudentCse updateStudent(Long id, StudentCse studentDetails) {
		StudentCse s = cseRepository.findById(id).get();
		s.setName(studentDetails.getName());
		s.setAge(studentDetails.getAge());
		return cseRepository.save(s);
	}

	@Override
	public void deleteStudent(Long id) {
		cseRepository.deleteById(id);

	}

}
