package com.scn.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PosApplication {

	/*
	The controller layer is responsible to accept the request from user,
	then the request goes to the service layer, his job is to do some processing,
	here is where the business logic take place, but this is not the place to fetch data,
	for that we have the DAO layer, this layer is the responsible to connect to the DB
	* */

	public static void main(String[] args) {
		SpringApplication.run(PosApplication.class, args);
	}
}
