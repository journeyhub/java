package com.java.controller;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CensusTractsInfo {
	
	 @JsonProperty("TRACT")
     private String tract;
     
     @JsonProperty("STATE")
     private String state;
     
     @JsonProperty("COUNTY")
     private String county;
     
     @JsonProperty("BLOCK")
     private String block;

	public String getTract() {
		return tract;
	}

	public void setTract(String tract) {
		this.tract = tract;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}
     
     
}
