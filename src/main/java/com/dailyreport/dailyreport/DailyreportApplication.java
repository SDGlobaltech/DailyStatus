package com.dailyreport.dailyreport;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DailyreportApplication {
	private static final Logger LOGGER = Logger.getAnonymousLogger();

	public static void main(String[] args) {
		System.out.println("Current Directory = " + System.getProperty("user.dir"));
		SpringApplication.run(DailyreportApplication.class, args);

		System.out.println("this is ramesh chowdary");
		LOGGER.info("just a test info log");
	}

}
