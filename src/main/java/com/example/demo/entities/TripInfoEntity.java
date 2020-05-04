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
@Table(name = "trip_infos")
public class TripInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String description;
	@Column(name = "date_time", nullable = false)
	private String dateTime;
	@ManyToOne
	@JoinColumn(name = "trip_id", nullable = false)
	private TripEntity trip;

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

	public void setDateTime(final String dateTime) {
		this.dateTime = dateTime;
	}

	public String getDateTime() {
		return this.dateTime;
	}

	public TripEntity getTrip() {
		return this.trip;
	}

	public void setTrip(final TripEntity trip) {
		this.trip = trip;
	}
}
