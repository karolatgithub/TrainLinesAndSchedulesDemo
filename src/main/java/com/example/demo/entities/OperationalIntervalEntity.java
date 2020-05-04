package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operational_intervals")
public class OperationalIntervalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(name = "start_date", nullable = false)
	private String startDate;
	@Column(name = "end_date", nullable = false)
	private String endDate;
	@Column(name = "on_monday", nullable = false, columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
	private Boolean onMonday;
	@Column(name = "on_thuesday", nullable = false, columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
	private Boolean onThuesday;
	@Column(name = "on_wednesday", nullable = false, columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
	private Boolean onWednesday;
	@Column(name = "on_thursday", nullable = false, columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
	private Boolean onThursday;
	@Column(name = "on_friday", nullable = false, columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
	private Boolean onFriday;
	@Column(name = "on_saturday", nullable = false, columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
	private Boolean onSaturday;
	@Column(name = "on_sunday", nullable = false, columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
	private Boolean onSunday;

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

	public void setStartDate(final String startDate) {
		this.startDate = startDate;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setEndDate(final String endDate) {
		this.endDate = endDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setOnMonday(final Boolean onMonday) {
		this.onMonday = onMonday;
	}

	public Boolean getOnMonday() {
		return this.onMonday;
	}

	public void setOnThuesday(final Boolean onThuesday) {
		this.onThuesday = onThuesday;
	}

	public Boolean getOnThuesday() {
		return this.onThuesday;
	}

	public void setOnWednesday(final Boolean onWednesday) {
		this.onWednesday = onWednesday;
	}

	public Boolean getOnWednesday() {
		return this.onWednesday;
	}

	public void setOnThursday(final Boolean onThursday) {
		this.onThursday = onThursday;
	}

	public Boolean getOnThursday() {
		return this.onThursday;
	}

	public void setOnFriday(final Boolean onFriday) {
		this.onFriday = onFriday;
	}

	public Boolean getOnFriday() {
		return this.onFriday;
	}

	public void setOnSaturday(final Boolean onSaturday) {
		this.onSaturday = onSaturday;
	}

	public Boolean getSaturday() {
		return this.onSaturday;
	}

	public void setOnSunday(final Boolean onSunday) {
		this.onSunday = onSunday;
	}

	public Boolean getSunday() {
		return this.onSunday;
	}
}
