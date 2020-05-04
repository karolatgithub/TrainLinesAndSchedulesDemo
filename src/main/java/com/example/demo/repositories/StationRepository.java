package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.StationEntity;

public interface StationRepository extends JpaRepository<StationEntity, Long> {

	StationEntity findByName(String departureStationName);

}
