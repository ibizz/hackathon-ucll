package be.ibizz.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import be.ibizz.hackathon.domain.Account;
import be.ibizz.hackathon.domain.Answer;
import be.ibizz.hackathon.domain.Question;
import be.ibizz.hackathon.domain.User;
import be.ibizz.hackathon.repository.AccountRepository;
import be.ibizz.hackathon.repository.AnswerRepository;
import be.ibizz.hackathon.repository.QuestionRepository;
import be.ibizz.hackathon.repository.UserRepository;

@Profile("cloudant")
@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired 
	private AccountRepository accountRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Account> getAccounts() {
		return accountRepository.getAll();
	}
	
	@Override
	public List<Question> getQuestions(String questionSet) {
		return questionRepository.getQuestionSet(questionSet);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.getAll();
	}

	@Override
	public void addAnswers(List<Answer> answers) {
		for(Answer answer : answers) {
			answerRepository.add(answer);
		}
	}



	
	
}
