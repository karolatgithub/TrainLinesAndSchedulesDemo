package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.OperatorEntity;

public interface OperatorRepository extends JpaRepository<OperatorEntity, Long> {
}
