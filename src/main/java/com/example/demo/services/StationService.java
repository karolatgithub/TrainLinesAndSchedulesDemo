package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.StationEntity;
import com.example.demo.repositories.StationRepository;

@Service
public class StationService {
	@Autowired
	private StationRepository repository;

	public List<StationEntity> findAll() {
		return repository.findAll();
	}

	public Optional<StationEntity> findById(final Long id) {
		return repository.findById(id);
	}

	public StationEntity save(final StationEntity station) {
		return repository.save(station);
	}

}
