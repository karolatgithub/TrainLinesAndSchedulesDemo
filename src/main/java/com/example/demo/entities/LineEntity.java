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
@Table(name = "lines")
public class LineEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	@ManyToOne
	@JoinColumn(name = "operator_id", nullable = false)
	private OperatorEntity operator;
	@ManyToOne
	@JoinColumn(name = "departure_station_id", nullable = false)
	private StationEntity departureStation;
	@ManyToOne
	@JoinColumn(name = "arrival_station_id", nullable = false)
	private StationEntity arrivalStation;

	public void setId(final Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDepartureStation(final OperatorEntity operator) {
		this.operator = operator;
	}

	public OperatorEntity getOperator() {
		return this.operator;
	}

	public void setOperator(final StationEntity departureStation) {
		this.departureStation = departureStation;
	}

	public StationEntity getDepartureStation() {
		return this.departureStation;
	}

	public void setArrivalStation(final StationEntity arrivalStation) {
		this.arrivalStation = arrivalStation;
	}

	public StationEntity getArrivalStation() {
		return this.arrivalStation;
	}
}
