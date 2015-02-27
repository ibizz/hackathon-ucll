package be.ibizz.hackathon;

import java.net.MalformedURLException;
import java.util.List;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.dataload.DataLoader;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.ektorp.spring.InitialDataLoader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ResourceLoader;

/**
 * Deze klasse bevat de configuratie van jullie applicatie. Ze bevat een
 * main-methode waardoor je een (embedded) application server kan starten vanuit
 * je IDE.
 */

@SpringBootApplication
public class Application {

  private static final String DATABASE_NAME = "mysterydb";
  @Value("${vcap.services.hackathon-cloudant.credentials.host}")
  private String host;
  @Value("${vcap.services.hackathon-cloudant.credentials.username}")
  private String username;
  @Value("${vcap.services.hackathon-cloudant.credentials.password}")
  private String password;	
	
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
  
  @Bean
  public CouchDbConnector couchDb() throws MalformedURLException {
    HttpClient httpClient = new StdHttpClient.Builder()
      .url("https://" + host)
      .port(443)
      .username(username)
      .password(password)
      .build();

    CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
    if (dbInstance.getAllDatabases().contains(DATABASE_NAME)) {
      dbInstance.deleteDatabase(DATABASE_NAME);
    }

    CouchDbConnector db = new StdCouchDbConnector(DATABASE_NAME, dbInstance);
    db.createDatabaseIfNotExists();
    return db;
  }

  @Bean
  public InitialDataLoader initialDataLoader(List<DataLoader> loaders, ResourceLoader resourceLoader) throws MalformedURLException {
    return new InitialDataLoader(loaders, resourceLoader);
  }

}