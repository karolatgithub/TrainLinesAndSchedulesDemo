package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.StationEntity;
import com.example.demo.services.LineService;
import com.example.demo.services.OperationalIntervalService;
import com.example.demo.services.OperatorService;
import com.example.demo.services.StationService;
import com.example.demo.services.TripInfoService;
import com.example.demo.services.TripScheduleService;
import com.example.demo.services.TripService;

@RestController
@RequestMapping("/restapi/v1/station/services")
public class StationRestApi {
	private final Logger log = LoggerFactory.getLogger(StationRestApi.class);
	@Autowired
	private StationService stationService;
	@Autowired
	private OperatorService operatorService;
	@Autowired
	private TripService tripService;
	@Autowired
	private TripScheduleService tripScheduleService;
	@Autowired
	private TripInfoService tripInfoService;
	@Autowired
	private OperationalIntervalService operationalIntervalService;
	@Autowired
	private LineService lineService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping
	public ResponseEntity<List> findAll() {
		final List ret = new ArrayList();
		ret.addAll(stationService.findAll());
		ret.addAll(operatorService.findAll());
		ret.addAll(operationalIntervalService.findAll());
		ret.addAll(tripService.findAll());
		ret.addAll(tripScheduleService.findAll());
		ret.addAll(tripInfoService.findAll());
		ret.addAll(lineService.findAll());
		ret.addAll(tripService.findDirectlyFromStationNameOnDay("Iława", "2019-08-01"));
		return ResponseEntity.ok(ret);
	}

	@PostMapping
	public ResponseEntity<StationEntity> save(@Valid
	@RequestBody
	final StationEntity entity) {
		return ResponseEntity.ok(stationService.save(entity));
	}

	@GetMapping("/{id}")
	public ResponseEntity<StationEntity> findById(@PathVariable
	final Long id) {
		final Optional<StationEntity> optional = stationService.findById(id);
		if (!optional.isPresent()) {
			log.warn(new StringBuilder("Station.Id=").append(id).append(" is not existed")
					.toString());
			ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(optional.get());
	}

	@GetMapping("/directly/{departureStationName}/{arrivalStationName}/{departureDate}")
	public ResponseEntity<List<Object[]>> findDirectlyFromToStationsOnDay(@PathVariable
	final String departureStationName, @PathVariable
	final String arrivalStationName, @PathVariable
	final String departureDate) {
		final List<Object[]> ret = tripService.findDirectlyFromToStationNameOnDay(
				departureStationName, arrivalStationName, departureDate);
		if ((ret == null) || ret.isEmpty()) {
			log.warn(new StringBuilder("for departureStationName=").append(departureStationName)
					.append(" and arrivalStationName=").append(arrivalStationName)
					.append(" and departureDate=").append(departureDate)
					.append(" not found any trip").toString());
			ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(ret);
	}

	@GetMapping("/onechange/{departureStationName}/{arrivalStationName}/{departureDate}")
	public ResponseEntity<List<Object[]>> findOneChangeFromToStationsOnDay(@PathVariable
	final String departureStationName, @PathVariable
	final String arrivalStationName, @PathVariable
	final String departureDate) {
		final List<Object[]> ret = tripService.findOneChangeFromToStationsOnDay(
				departureStationName, arrivalStationName, departureDate);
		if ((ret == null) || ret.isEmpty()) {
			log.warn(new StringBuilder("for departureStationName=").append(departureStationName)
					.append(" and arrivalStationName=").append(arrivalStationName)
					.append(" and departureDate=").append(departureDate)
					.append(" not found any trip").toString());
			ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(ret);
	}
}
