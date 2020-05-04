package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.TripEntity;

public interface TripRepository extends JpaRepository<TripEntity, Long> {

	@Query(value = "SELECT d.departure_time,d.station_id AS departure_station_id,d.description"
			+ ",a.arrival_time,a.station_id AS arrival_station_id,l.name"
			+ " FROM operational_intervals oi JOIN trips t ON oi.id=t.operational_interval_id"
			+ "	JOIN trip_schedules d ON d.trip_id = t.id AND d.departure_time IS NOT NULL"
			+ " AND d.departure_time > :departure_time"
			+ "	AND d.station_id = :departure_station_id"
			+ "	JOIN trip_schedules a ON a.trip_id = t.id AND a.arrival_time IS NOT NULL"
			+ "	AND a.station_id = :arrival_station_id"
			+ " JOIN lines l ON l.id=t.line_id WHERE :departure_date BETWEEN oi.start_date AND oi.end_date"
			+ " AND d.id < a.id AND t.id <> :trip_id ORDER BY d.departure_time LIMIT :limit", nativeQuery = true)
	List<Object[]> findDirectlyFromToStationIdOnDayAfterTime(@Param("departure_station_id")
	final Long departureStationId, @Param("arrival_station_id")
	final Long arrivalStationId, @Param("departure_date")
	final String departureDate, @Param("departure_time")
	final String departureTime, @Param("trip_id")
	final Long id, @Param("limit")
	final Integer limit);

	@Query(value = "SELECT d.departure_time,d.station_id AS departure_station_id,d.description"
			+ " ,a.arrival_time,a.station_id AS arrival_station_id,l.name,t.id"
			+ " FROM operational_intervals oi JOIN trips t ON oi.id=t.operational_interval_id"
			+ "	JOIN trip_schedules d ON d.trip_id = t.id AND d.departure_time IS NOT NULL"
			+ "	AND d.station_id = :departure_station_id"
			+ "	JOIN trip_schedules a ON a.trip_id = t.id AND a.arrival_time IS NOT NULL"
			+ " JOIN lines l ON l.id=t.line_id WHERE :departure_date BETWEEN oi.start_date AND oi.end_date"
			+ " AND d.id<a.id ORDER BY d.departure_time", nativeQuery = true)
	List<Object[]> findDirectlyFromStationIdOnDay(@Param("departure_station_id")
	final Long departureStationId, @Param("departure_date")
	final String departureDate);
}
