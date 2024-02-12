package com.java.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CensusTractsRequest {

	private String street;
	private String city;
	private String state;
	private String zip;

}
