package com.example.university.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.entity.ITStudent;
import com.example.university.repository.ITRepository;
import com.example.university.service.ITService;

@Service
public class ITServiceImpl implements ITService {

	@Autowired
	private ITRepository itRepository;
	
	@Override
	public ITStudent saveITStudent(ITStudent itStudent) {
		return itRepository.save(itStudent);
	}

	@Override
	public List<ITStudent> getAllItStudents() {
		return itRepository.findAll();
	}

	@Override
	public ITStudent getItStudent(long id) {
		Optional<ITStudent> optionalEmployee = itRepository.findById(id);
		return optionalEmployee.get();	}

	@Override
	public ITStudent updateItStudent(ITStudent itStudent, long id) {
		ITStudent it = itRepository.findById(id).get();
		it.setName(itStudent.getName());
		it.setEmail(itStudent.getEmail());
		return itRepository.save(it);
	}

	@Override
	public void deleteItStudent(long id) {
		itRepository.findById(id).get();
		itRepository.deleteById(id);
	}

}
