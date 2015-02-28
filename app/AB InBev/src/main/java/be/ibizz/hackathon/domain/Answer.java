package be.ibizz.hackathon.domain;

import java.util.Date;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

/**
 * Een antwoord is het antwoord op 1 bepaalde vraag. Let op, we slaan hier 
 * de omschrijving van de vraag op en niet de questionId. 
 * 
 * We kiezen ervoor dit te denormaliseren om makkelijker achteraf te kunnen tonen in het overzicht.
 */
@TypeDiscriminator("doc.type == 'answer'")
public class Answer extends CouchDbDocument {

	private static final long serialVersionUID = -1562524054707869788L;
	private String type;
	private String accountId;
	private String userId;
	private String question;
	private String answer;
	private Date visitDate;

	public Answer() {
	}
	
	public Answer(String accountId, String userId, String question, String answer, Date visitDate) {
		this.type = "answer";
		this.accountId = accountId;
		this.userId = userId;
		this.question = question;
		this.answer = answer;
		this.visitDate = visitDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
