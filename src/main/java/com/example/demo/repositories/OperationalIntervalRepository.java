package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.OperationalIntervalEntity;

public interface OperationalIntervalRepository
		extends JpaRepository<OperationalIntervalEntity, Long> {
}
