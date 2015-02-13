package be.ibizz.hackathon.service;

import be.ibizz.hackathon.domain.Greeting;

/**
 * Dit is een standaard java interface klasse. We doen hier niets specifiek. 
 * 
 * Deze interface zorgt voor een contract tussen implementatie en de klasse waarin 
 * de functionaliteit wordt opgeroepen.
 */
public interface GreetingService {

	Greeting sayHello();
	
}
