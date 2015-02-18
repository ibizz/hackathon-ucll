package be.ibizz.hackathon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import be.ibizz.hackathon.domain.Greeting;

/**
 * Deze klasse is de implementatie van de GreetingService interface.
 * Door de @Service annotatie, weet Spring dat hij deze kan gebruiken om te autowiren.
 * <p/>
 * Andere klassen werken steeds tegen de interface, nooit rechtstreeks tegen deze klasse.
 */
@Service
public class CloudantServiceImpl implements CloudantService {
  private Logger logger = LoggerFactory.getLogger(CloudantServiceImpl.class);

  @Value("${vcap.services.cloudantNoSQLDB.credentials.url:}")
  private String url;
  @Value("${vcap.services.cloudantNoSQLDB.credentials.username:}")
  private String username;
  @Value("${vcap.services.cloudantNoSQLDB.credentials.password:}")
  private String password;

  @Override
  public Greeting sayHello() {
    logger.info("Call sayHello()");

    logger.info("URL: {}", url);
    logger.info("username: {}", username);
    logger.info("password: {}", password);

    return new Greeting("Hello World!");
  }
}