package be.ibizz.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.ibizz.hackathon.domain.Account;
import be.ibizz.hackathon.domain.Question;
import be.ibizz.hackathon.domain.User;
import be.ibizz.hackathon.repository.AccountRepository;
import be.ibizz.hackathon.repository.QuestionRepository;
import be.ibizz.hackathon.repository.UserRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired 
	private AccountRepository accountRepository;
	
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
		return questionRepository.findByQuestionSet(questionSet);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.getAll();
	}



	
	
}
