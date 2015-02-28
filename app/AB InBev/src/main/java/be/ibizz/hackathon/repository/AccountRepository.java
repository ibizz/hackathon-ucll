package be.ibizz.hackathon.repository;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import be.ibizz.hackathon.domain.Account;

/**
 * Repository om accounts te lezen/schrijven. We gebruiken enkel de standaard functionaliteit, 
 * Er zijn dus geen extra methodes aanwezig.
 */
@Repository
@Profile("cloudant")
@View(name = "all", map = "function(doc) { if (doc.type == 'account' ) emit( null, doc )}")
public class AccountRepository extends AbstractCloudantRepository<Account> {
	
	@Autowired
	public AccountRepository(CouchDbConnector db) {
	    super(Account.class, db, "classpath:/database/accounts.json");   
	}

}
