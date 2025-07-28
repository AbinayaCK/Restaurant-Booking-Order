package com.edureProject.RestaurantBookingOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantBookingOrderApplication {

	public static void main(String[] args) {
		System.getProperties().put("server.port",8010);
		SpringApplication.run(RestaurantBookingOrderApplication.class, args);
	}

}
