package be.ibizz.hackathon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import be.ibizz.hackathon.domain.Greeting;

/**
 * Deze klasse is de implementatie van de GreetingService interface. 
 * Door de @Service annotatie, weet Spring dat hij deze kan gebruiken om te autowiren. 
 * 
 * Andere klassen werken steeds tegen de interface, nooit rechtstreeks tegen deze klasse. 
 */
@Service
public class CloudantServiceImpl implements CloudantService {

	private Logger logger = LoggerFactory.getLogger(CloudantServiceImpl.class);
	
	@Override
	public Greeting sayHello() {
		logger.info("Call sayHello()");
		return new Greeting("Hello World!");
	}



}
