package be.ibizz.hackathon.repository;

import java.util.List;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.View;
import org.ektorp.support.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import be.ibizz.hackathon.domain.Question;

@Repository
@Profile("cloudant")
@Views({
	@View(name = "all", map = "function(doc) {if (doc.type == 'question') emit(null, doc)}"),
	@View(name = "by_questionSet", map = "function(doc) {if(doc.type == 'question' && doc.questionSets.length > 0) {for(var i in doc.questionSets) {emit(doc.questionSets[i], null);}}}")})
public class QuestionRepository extends AbstractCloudantRepository<Question> {
	
	@Autowired
	public QuestionRepository(CouchDbConnector db) {
	    super(Question.class, db, "classpath:/database/questions.json");   
	}
	
	public List<Question> getQuestionSet(String questionSet) {	
		return queryView("by_questionSet", questionSet);
	}

}
