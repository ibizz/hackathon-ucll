package be.ibizz.hackathon.domain;

import java.util.List;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

@TypeDiscriminator("doc.type == 'question'")
public class Question extends CouchDbDocument {

	private static final long serialVersionUID = 5638063953598415780L;
	private String type;
	private List<String> questionSets;
	private String description;
	private String questionType;
	private String startDate;
	private String endDate;
	private List<String> possibleValues;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getQuestionSets() {
		return questionSets;
	}

	public void setQuestionSets(List<String> questionSets) {
		this.questionSets = questionSets;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getEndDate() {
		return endDate;
	}

	public List<String> getPossibleValues() {
		return possibleValues;
	}

	public void setPossibleValues(List<String> possibleValues) {
		this.possibleValues = possibleValues;
	}

}
