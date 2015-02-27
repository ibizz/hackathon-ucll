package be.ibizz.hackathon.repository;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.ibizz.hackathon.domain.Account;

@Repository
@View(name = "all", map = "function(doc) { if (doc.type == 'account' ) emit( null, doc )}")
public class AccountRepository extends AbstractCloudantRepository<Account> {
	
	@Autowired
	public AccountRepository(CouchDbConnector db) {
	    super(Account.class, db, "classpath:/database/accounts.json");   
	}

}
