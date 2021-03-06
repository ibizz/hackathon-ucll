package be.ibizz.hackathon.repository;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import be.ibizz.hackathon.domain.User;

/**
 * Repository om gebruikers te lezen/schrijven. We gebruiken enkel de standaard functionaliteit, 
 * Er zijn dus geen extra methodes aanwezig.
 */
@Repository
@Profile("cloudant")
@View(name = "all", map = "function(doc) { if (doc.type == 'user' ) emit( null, doc )}")
public class UserRepository extends AbstractCloudantRepository<User> {
	
	@Autowired
	public UserRepository(CouchDbConnector db) {
	    super(User.class, db, "classpath:/database/users.json");
	}

}
