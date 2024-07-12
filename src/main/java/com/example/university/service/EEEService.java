package com.example.university.service;

import java.util.List;

import com.example.university.entity.EEE;

public interface EEEService {
	public EEE createEEE(EEE eee);

	public EEE getEEEById(Long eeeId);

	public List<EEE> getAllEEE();

	public EEE updateEEE(EEE eee);

	public void deleteEEE(Long eeeId);

}
