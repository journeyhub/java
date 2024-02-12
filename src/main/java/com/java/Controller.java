//package com.java;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//@RestController
//public class Controller {
//	
//    @GetMapping("/talk")
//    public String simplseAPI() {
//    	return "Hi";
//    }
//    
//    @PostMapping("/googleapis")
//    public ResponseEntity simpleAPI() {
//    	System.out.println("Hi");
//    	Object postForObject = null;
//    	RestTemplate restTemplate = new RestTemplate();
//    	try {
//    		String url = "https://www.googleapis.com/geolocation/v1/geolocate?key=12345";
//        	 postForObject = restTemplate.postForObject(url, null, Object.class);
//		} catch (Exception e) {
//			return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
//		}
//		return (ResponseEntity) postForObject;
//    }
//    
//}