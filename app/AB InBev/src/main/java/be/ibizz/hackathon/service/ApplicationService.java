package be.ibizz.hackathon.service;

import java.util.List;

import be.ibizz.hackathon.domain.Account;
import be.ibizz.hackathon.domain.Answer;
import be.ibizz.hackathon.domain.Question;
import be.ibizz.hackathon.domain.User;

public interface ApplicationService {

	List<Account> getAccounts();
	
	List<Question> getQuestions(String questionSet);
	
	List<User> getUsers();
	
	void addAnswers(List<Answer> answers);
	
}
