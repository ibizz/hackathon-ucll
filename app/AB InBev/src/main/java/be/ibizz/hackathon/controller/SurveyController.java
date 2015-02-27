package be.ibizz.hackathon.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.ibizz.hackathon.domain.Question;
import be.ibizz.hackathon.service.ApplicationService;

@RestController
@RequestMapping(value = "/api/survey")
public class SurveyController {

	 @Autowired
	  private ApplicationService applicationService;
	
	  @RequestMapping("/{questionSet}")
	  public List<Question> getSurvey(@PathParam("questionSet") String accountId) {
	    return applicationService.getQuestions("questionSet");
	  }
	
	  
	  
}
