package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.TripInfoEntity;

public interface TripInfoRepository extends JpaRepository<TripInfoEntity, Long> {
}
