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
@Table(name = "trips")
public class TripEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "line_id", nullable = false)
	private LineEntity line;
	@ManyToOne
	@JoinColumn(name = "operational_interval_id", nullable = false)
	private OperationalIntervalEntity operationalInterval;
	@Column(name = "departure_time", nullable = false)
	private String departureTime;
	@Column(name = "arrival_time", nullable = false)
	private String arrivalTime;

	public void setId(final Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public LineEntity getLine() {
		return this.line;
	}

	public void setLine(final LineEntity line) {
		this.line = line;
	}

	public OperationalIntervalEntity getOperationalInterval() {
		return this.operationalInterval;
	}

	public void setOperationalInterval(final OperationalIntervalEntity operationalInterval) {
		this.operationalInterval = operationalInterval;
	}

	public void setDepartureTime(final String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}

	public void setArrivalTime(final String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getArrivalTime() {
		return this.arrivalTime;
	}
}
