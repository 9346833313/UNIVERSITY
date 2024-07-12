package com.example.university.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.university.entity.studentece;
import com.example.university.repository.ECERepository;
import com.example.university.service.ECEService;

@Service
public class ECEServiceimpl implements ECEService {

	@Autowired
	private ECERepository eceRepository;

	@Override
	public ResponseEntity<?> createEce(studentece student) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(eceRepository.save(student), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<?> getAll() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(eceRepository.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> updateEce(studentece student, long id) {
		Optional<studentece> findById = eceRepository.findById(id);
		if(findById.isPresent()) {
			studentece std=findById.get();
			std.setBranch(student.getBranch());
			std.setRollNo(student.getRollNo());
		eceRepository.save(std);
			new ResponseEntity<>(std,HttpStatus.OK);
		}
		return new ResponseEntity<>("id not found",HttpStatus.BAD_REQUEST);
		
	
	}

	@Override
	public ResponseEntity<?> deleteEce(long id) {
		Optional<studentece> findById = eceRepository.findById(id);
		if (findById.isPresent()) {
			studentece std = findById.get();

			return new ResponseEntity<>(std, HttpStatus.OK);

		} else {
			return new ResponseEntity<>("id not found", HttpStatus.BAD_REQUEST);
		}
	}

}
