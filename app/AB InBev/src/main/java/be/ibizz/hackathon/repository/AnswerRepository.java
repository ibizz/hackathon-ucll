package be.ibizz.hackathon.repository;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import be.ibizz.hackathon.domain.Answer;

/**
 * Repository om antwoorden te lezen/schrijven. We gebruiken enkel de standaard functionaliteit, 
 * Er zijn dus geen extra methodes aanwezig.
 */
@Repository
@Profile("cloudant")
@View(name = "all", map = "function(doc) { if (doc.type == 'answer' ) emit( null, doc )}")
public class AnswerRepository extends AbstractCloudantRepository<Answer> {
	
	@Autowired
	public AnswerRepository(CouchDbConnector db) {
	    super(Answer.class, db, "classpath:/database/answers.json");   
	}

}
