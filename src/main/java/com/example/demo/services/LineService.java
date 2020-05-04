package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.LineEntity;
import com.example.demo.repositories.LineRepository;

@Service
public class LineService {
	@Autowired
	private LineRepository repository;

	public List<LineEntity> findAll() {
		return repository.findAll();
	}

	public Optional<LineEntity> findById(final Long id) {
		return repository.findById(id);
	}

	public LineEntity save(final LineEntity station) {
		return repository.save(station);
	}

}
