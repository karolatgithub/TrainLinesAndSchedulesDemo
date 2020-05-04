package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trip_schedules")
public class TripScheduleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	@ManyToOne
	@JoinColumn(name = "trip_id", nullable = false)
	private TripEntity trip;
	@ManyToOne
	@JoinColumn(name = "station_id", nullable = false)
	private StationEntity station;
	@Column(name = "arrival_time")
	private String arrivalTime;
	@Column(name = "departure_time")
	private String departureTime;

	public void setId(final Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setTrip(final TripEntity trip) {
		this.trip = trip;
	}

	public TripEntity getTrip() {
		return this.trip;
	}

	public void setStation(final StationEntity station) {
		this.station = station;
	}

	public StationEntity getStation() {
		return this.station;
	}

	public void setArrivalTime(final String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getArrivalTime() {
		return this.arrivalTime;
	}

	public void setDepartureTime(final String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}
}
