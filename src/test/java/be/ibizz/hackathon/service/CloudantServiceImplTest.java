package be.ibizz.hackathon.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.ibizz.hackathon.domain.Greeting;

/**
 * Deze klasse bevat de unit testen voor de GreetingServiceImpl
 * 
 * Merk op dat we hier de implementatie testen, en dus niet de interface. 
 * De interface is enkel het contract en bevat verder geen functionaliteit.
 */
public class CloudantServiceImplTest {

	private CloudantServiceImpl greetingService;
	
	@Before
	public void setUp() {
		greetingService = new CloudantServiceImpl();
	}
	
	@Test
	public void test() {
		assertEquals(new Greeting("Hello World!"), greetingService.sayHello());
	}
	
}
