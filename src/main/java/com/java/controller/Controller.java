package com.java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	@PostMapping("/censusTracts")
	public ResponseEntity<CensusTractsInfo> getGeoData(@RequestBody CensusTractsRequest request) {
		RestTemplate restClient = new RestTemplate();
		CensusTractsInfo censusTractsInfo = new CensusTractsInfo();
		String city = request.getCity();
		String state =request.getState();
		String zip = request.getZip();
		String street = request.getStreet();
		
		String url = "https://geocoding.geo.census.gov/geocoder/geographies/address?street="+street+"&city="+city+"&state="+state+"&zip="+zip+"&benchmark=4&vintage=420&format=json";
		ResponseEntity<GeocodingApiResponse> response = restClient.getForEntity(url, GeocodingApiResponse.class);
		String country =  response.getBody().getResult().getAddressMatches().get(0).getGeographies().getCensusBlocks().get(0).getCounty();
		String rstate = response.getBody().getResult().getAddressMatches().get(0).getGeographies().getCensusBlocks().get(0).getState();
		String tract = response.getBody().getResult().getAddressMatches().get(0).getGeographies().getCensusBlocks().get(0).getTract();
		String block = response.getBody().getResult().getAddressMatches().get(0).getGeographies().getCensusBlocks().get(0).getBlock();
		
		censusTractsInfo.setBlock(block);
		censusTractsInfo.setCounty(country);
		censusTractsInfo.setState(rstate);
		censusTractsInfo.setTract(tract);
		return new ResponseEntity<CensusTractsInfo>(censusTractsInfo, HttpStatus.OK);
		
	}
}
