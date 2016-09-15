package com.festivities.model;

import java.time.Instant;

public class Festivity {
    private Long id;
    private String name;
    private String place;
    private Instant start;
    private Instant end;

    public Festivity() {}

    public void setId(Long id) {
	this.id = id;
    }
    public void setName(String name) {
	this.name = name;
    }
    public void setPlace(String place) {
	this.place = place;
    }
    public void setStart(Instant start) {
	this.start = start;
    }
    public void setEnd(Instant end) {
	this.end = end;
    }
    public Long getId() {
	return this.id;
    }
    public String getName() {
	return this.name;
    }
    public String getPlace() {
	return this.place;
    }
    public Instant getStart() {
	return this.start;
    }
    public Instant getEnd() {
	return this.end;
    }
}
