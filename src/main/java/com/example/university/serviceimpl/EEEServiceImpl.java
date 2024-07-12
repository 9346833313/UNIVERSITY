package com.example.university.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.university.entity.EEE;
import com.example.university.repository.EEERepository;
import com.example.university.service.EEEService;

public class EEEServiceImpl implements EEEService {
	@Autowired
	private EEERepository eeeRepository;

	@Override
	public EEE createEEE(EEE eee) {
		// TODO Auto-generated method stub
		return eeeRepository.save(eee);
	}

	@Override
	public EEE getEEEById(Long eeeId) {
		// TODO Auto-generated method stub
		Optional<EEE> optionalEEE = eeeRepository.findById(eeeId);
		return optionalEEE.get();
	}

	@Override
	public List<EEE> getAllEEE() {
		// TODO Auto-generated method stub
		return eeeRepository.findAll();
	}

	@Override
	public EEE updateEEE(EEE eee) {
		// TODO Auto-generated method stub
		EEE existingEEE = eeeRepository.findById(eee.getId()).get();
		existingEEE.setName(eee.getName());
		existingEEE.setSpecialization(eee.getSpecialization());
		existingEEE.setEmail(eee.getEmail());
		EEE updatedEEE = eeeRepository.save(existingEEE);
		return updatedEEE;
	}

	@Override
	public void deleteEEE(Long eeeId) {
		// TODO Auto-generated method stub
		eeeRepository.deleteById(eeeId);
	}

}
