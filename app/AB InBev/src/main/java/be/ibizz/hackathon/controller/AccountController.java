package be.ibizz.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.ibizz.hackathon.domain.Account;
import be.ibizz.hackathon.service.ApplicationService;

/**
 * Deze controller wordt gebruikt om gevens over cafe's, restaurants en supermarkten op te vragen. 
 * Indien je naar http://localhost:8080/api/accounts surft, dan zie je het resultaat.
 * 
 * Omdat @RestController hier is gedefinieerd gaat Spring standaard het gereturnde object serializeren naar JSON.
 */
@RestController
@RequestMapping(value = "/api/accounts")
public class AccountController {

	  @Autowired
	  private ApplicationService applicationService;
	
	  @RequestMapping
	  public List<Account> getAll() {
	    return applicationService.getAccounts();
	  }
	
}
