package be.ibizz.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.ibizz.hackathon.domain.Greeting;
import be.ibizz.hackathon.service.CloudantService;

/**
 * Dit is een 'controller' klasse (dus de C uit MVC). Ze bevat een endpoint 
 * die je vanuit de browser kan oproepen door naar de url <HOST_URL>/hello te 
 * gaan.
 * 
 * De return-statement geeft een java-object terug. Spring zal omdat we hebben aangeduidt dat dit 
 * een RestController is, standaard JSON teruggeven.
 * 
 * De functie roept achterliggend een service op. We werken hier tegen de interface 
 * (GreetingService) en niet implementatie (GreetingServiceImpl) zodat er een duidelijke scheiding 
 * blijft tussen de verschillende lagen van onze applicatie. 'Autowiring' is een concept binnen 
 * Spring die ons toelaat deze scheiding te maken (dmv Dependency Injection)
 */
@RestController
public class HelloController {

	@Autowired
	private CloudantService greetingService;
	
	@RequestMapping("/hello")
	public Greeting hello() {
		return greetingService.sayHello();
	}

}