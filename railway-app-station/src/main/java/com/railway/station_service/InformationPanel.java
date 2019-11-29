package com.railway.station_service;

import javax.persistence.*;
import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"platform"})
public class InformationPanel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String currentinfo;

	
	@ManyToOne
	private Platform platform;
	
	
	private InformationPanel() {
	}
	

	public InformationPanel(String currentinfo) {
		this.currentinfo = currentinfo;
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCurrentinfo() {
		return currentinfo;
	}
	
	public void setCurrentinfo(String currentinfo) {
		this.currentinfo = currentinfo;
	}


	public Platform getPlatform() {
		return platform;
	}


	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
}
