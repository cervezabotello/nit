package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;




@SpringBootApplication
public class JpaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaPracticeApplication.class, args);
	}
	
	
	String url = "www.google.com" ; 
	RestTemplate r  =  new RestTemplate() ; 
	ResponseEntity<String>  re =  r.getForEntity(url, String.class) ; 

		
	
		
			

}
	