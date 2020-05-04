package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.TripScheduleEntity;

public interface TripScheduleRepository extends JpaRepository<TripScheduleEntity, Long> {

}
