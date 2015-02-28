package be.ibizz.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.ibizz.hackathon.domain.Account;
import be.ibizz.hackathon.service.ApplicationService;

/**
 * Dit is de controller om een lijst van de bestaande users op te halen.
 */
@RestController
@RequestMapping(value = "/api/users")
public class UserController {

	  @Autowired
	  private ApplicationService applicationService;
	
	  @RequestMapping
	  public List<Account> getAll() {
	    return applicationService.getAccounts();
	  }
	
}
