package be.ibizz.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Deze klasse bevat de configuratie van jullie applicatie. Ze bevat een 
 * main-methode waardoor je een (embedded) application server kan starten vanuit 
 * je IDE.
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}