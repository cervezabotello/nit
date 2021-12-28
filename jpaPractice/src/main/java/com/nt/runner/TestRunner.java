package com.nt.runner;

import java.net.URI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		String url = "www.google.com";
		RestTemplate r = new RestTemplate();

		ResponseEntity<String> response = r.getForEntity(url, null, args);
		//Object forEntity = r.getForEntity(url, null) ; 
		/*	response.getBody() ; 
			response.getStatusCode().name() ; 
			response.getStatusCodeValue() ; */

	}

}
