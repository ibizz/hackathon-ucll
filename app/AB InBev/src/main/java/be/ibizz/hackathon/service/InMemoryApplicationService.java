package be.ibizz.hackathon.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import be.ibizz.hackathon.domain.Account;
import be.ibizz.hackathon.domain.Answer;
import be.ibizz.hackathon.domain.Question;
import be.ibizz.hackathon.domain.User;

@Service
@Profile("cloudantStub")
public class InMemoryApplicationService implements ApplicationService {

	private List<Account> accounts;
	private List<Question> questions;
	private List<User> users;
	private List<Answer> answers;
	
	@PostConstruct
	public void init() {
		accounts = new ArrayList<>();
		accounts.add(new Account("2", "Delhaize Shop'n Go", "Tervuursevest 58, 3000 Leuven", "Offtrade"));
		
		questions = new ArrayList<>();
		questions.add(new Question(Arrays.asList("1"), "Is Jupiler available on the shelf?", "Checkbox", null));
		
		users = new ArrayList<>();
		users.add(new User("Jef", "De Wit"));
		
		answers = new ArrayList<>();
		answers.add(new Answer("1", "2", "Is Jupiler available on the shelf?", "Yes", new Date()));
	}
	
	@Override
	public List<Account> getAccounts() {
		return accounts;
	}

	@Override
	public List<Question> getQuestions(String questionSet) {
		return questions;
	}

	@Override
	public List<User> getUsers() {
		return users;
	}

	@Override
	public void addAnswers(List<Answer> answers) {
		answers.addAll(answers);
	}

}
