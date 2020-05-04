package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.TripScheduleEntity;
import com.example.demo.repositories.TripScheduleRepository;

@Service
public class TripScheduleService {
	@Autowired
	private TripScheduleRepository repository;

	public List<TripScheduleEntity> findAll() {
		return repository.findAll();
	}

	public Optional<TripScheduleEntity> findById(final Long id) {
		return repository.findById(id);
	}

	public TripScheduleEntity save(final TripScheduleEntity station) {
		return repository.save(station);
	}

}
