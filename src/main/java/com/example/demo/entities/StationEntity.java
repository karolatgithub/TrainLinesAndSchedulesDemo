package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stations")
public class StationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique = true)
	private String name;

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
}
