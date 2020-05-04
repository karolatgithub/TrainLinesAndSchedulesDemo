package com.example.demo.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.StationEntity;
import com.example.demo.entities.TripEntity;
import com.example.demo.repositories.StationRepository;
import com.example.demo.repositories.TripRepository;

@Service
public class TripService {
	@Autowired
	private TripRepository tripRepository;
	@Autowired
	private StationRepository stationRepository;

	public List<TripEntity> findAll() {
		return tripRepository.findAll();
	}

	public Optional<TripEntity> findById(final Long id) {
		return tripRepository.findById(id);
	}

	public TripEntity save(final TripEntity station) {
		return tripRepository.save(station);
	}

	public List<Object[]> findDirectlyFromToStationNameOnDay(final String departureStationName,
			final String arrivalStationName, final String departureDate) {
		final StationEntity departureStation = stationRepository.findByName(departureStationName);
		final StationEntity arrivalStation = stationRepository.findByName(arrivalStationName);
		final List<Object[]> ret = tripRepository.findDirectlyFromToStationIdOnDayAfterTime(
				departureStation.getId(), arrivalStation.getId(), departureDate, "00:00", 0L, 200);
		for (final Object[] objects : ret) {
			objects[1] = departureStation.getName();
			objects[4] = arrivalStation.getName();
		}
		return ret;
	}

	public List<Object[]> findDirectlyFromStationNameOnDay(final String departureStationName,
			final String departureDate) {
		final StationEntity departureStation = stationRepository.findByName(departureStationName);
		return tripRepository.findDirectlyFromStationIdOnDay(departureStation.getId(),
				departureDate);
	}

	public List<Object[]> findOneChangeFromToStationsOnDay(final String departureStationName,
			final String arrivalStationName, final String departureDate) {
		final StationEntity departureStation = stationRepository.findByName(departureStationName);
		final StationEntity arrivalStation = stationRepository.findByName(arrivalStationName);
		final List<Object[]> out = new ArrayList<Object[]>();
		final List<Object[]> arrivals = tripRepository
				.findDirectlyFromStationIdOnDay(departureStation.getId(), departureDate);
		final Set<Long> usedTrip = new HashSet<Long>();
		for (final Object[] arrival : arrivals) {
			final Long tripId = ((BigInteger) arrival[6]).longValue();
			if (usedTrip.contains(tripId)) {
				continue;
			}
			final Long id = ((BigInteger) arrival[4]).longValue();
			final List<Object[]> ret = tripRepository.findDirectlyFromToStationIdOnDayAfterTime(id,
					arrivalStation.getId(), departureDate, (String) arrival[3], tripId, 1);
			if ((ret != null) && (!ret.isEmpty())) {
				final Object[] retObjs = ret.get(0);
				arrival[1] = departureStation.getName();
				arrival[4] = stationRepository.findById(id).get().getName();
				retObjs[1] = arrival[4];
				retObjs[4] = arrivalStationName;
				final Object[] objects = new Object[arrival.length + retObjs.length];
				int i = -1;
				for (final Object obj : arrival) {
					objects[++i] = obj;
				}
				for (final Object obj : retObjs) {
					objects[++i] = obj;
				}
				out.add(objects);
				usedTrip.add(tripId);
			}
		}
		return out;
	}

}
