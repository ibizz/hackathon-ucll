package be.ibizz.hackathon.service;

import org.springframework.stereotype.Service;

import be.ibizz.hackathon.domain.Greeting;

/**
 * Deze klasse is de implementatie van de GreetingService interface. 
 * Door de @Service annotatie, weet Spring dat hij deze kan gebruiken om te autowiren. 
 * 
 * Andere klassen werken steeds tegen de interface, nooit rechtstreeks tegen deze klasse. 
 */
@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public Greeting sayHello() {
		return new Greeting("Hello World!");
	}

}
