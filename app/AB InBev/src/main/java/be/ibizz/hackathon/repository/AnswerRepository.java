package be.ibizz.hackathon.repository;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.ibizz.hackathon.domain.Answer;

@Repository
@View(name = "all", map = "function(doc) { if (doc.type == 'answer' ) emit( null, doc )}")
public class AnswerRepository extends AbstractCloudantRepository<Answer> {
	
	@Autowired
	public AnswerRepository(CouchDbConnector db) {
	    super(Answer.class, db, "classpath:/database/answers.json");   
	}

}