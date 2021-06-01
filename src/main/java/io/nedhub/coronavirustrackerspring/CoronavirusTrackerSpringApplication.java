package io.nedhub.coronavirustrackerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerSpringApplication.class, args);
	}

}
