package be.ibizz.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.ibizz.hackathon.domain.Answer;
import be.ibizz.hackathon.domain.Question;
import be.ibizz.hackathon.service.ApplicationService;

/**
 * Controller om een vragenlijst op te halen voor een bepaalde account. 
 * Dit gebeurt aan de hand van de questionSet.
 * 
 * Antwoorden op deze vragen kunnen ook hier gePOST worden.
 */
@RestController
@RequestMapping(value = "/api/survey")
public class SurveyController {

	 @Autowired
	  private ApplicationService applicationService;
	
	  @RequestMapping("/{questionSet}")
	  public List<Question> getSurvey(@PathVariable("questionSet") String questionSet) {
	    return applicationService.getQuestions(questionSet);
	  }
	
	  @RequestMapping(method = RequestMethod.POST)
	  public void addSurvey(@RequestBody List<Answer> answers) {
	    applicationService.addAnswers(answers);
	  }
	  
}
