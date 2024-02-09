package com.java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	@GetMapping("/test")
	public ResponseEntity<ApiResponse> getGeoData() {
		RestTemplate restClient = new RestTemplate();
		String url = "https://geocoding.geo.census.gov/geocoder/geographies/address?street=777+Long+Ridge+Rd&city=Stamford&state=CT&zip=06905&benchmark=4&vintage=420&format=json";
		ResponseEntity<ApiResponse> forEntity = restClient.getForEntity(url, ApiResponse.class);
		
		return new ResponseEntity(forEntity.getBody(), HttpStatus.OK);
		
	}
}
