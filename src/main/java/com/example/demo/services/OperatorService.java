package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.OperatorEntity;
import com.example.demo.repositories.OperatorRepository;

@Service
public class OperatorService {
	@Autowired
	private OperatorRepository repository;

	public List<OperatorEntity> findAll() {
		return repository.findAll();
	}

	public Optional<OperatorEntity> findById(final Long id) {
		return repository.findById(id);
	}

	public OperatorEntity save(final OperatorEntity station) {
		return repository.save(station);
	}

}
