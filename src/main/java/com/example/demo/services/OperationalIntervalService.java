package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.OperationalIntervalEntity;
import com.example.demo.repositories.OperationalIntervalRepository;

@Service
public class OperationalIntervalService {
	@Autowired
	private OperationalIntervalRepository repository;

	public List<OperationalIntervalEntity> findAll() {
		return repository.findAll();
	}

	public Optional<OperationalIntervalEntity> findById(final Long id) {
		return repository.findById(id);
	}

	public OperationalIntervalEntity save(final OperationalIntervalEntity station) {
		return repository.save(station);
	}

}
