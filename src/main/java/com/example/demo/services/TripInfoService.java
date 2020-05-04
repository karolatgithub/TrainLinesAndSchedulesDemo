package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.TripInfoEntity;
import com.example.demo.repositories.TripInfoRepository;

@Service
public class TripInfoService {
	@Autowired
	private TripInfoRepository repository;

	public List<TripInfoEntity> findAll() {
		return repository.findAll();
	}

	public Optional<TripInfoEntity> findById(final Long id) {
		return repository.findById(id);
	}

	public TripInfoEntity save(final TripInfoEntity station) {
		return repository.save(station);
	}

}
