package be.ibizz.hackathon.domain;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

/**
 * Een Account is een cafe, supermarkt of restaurant.
 */
@TypeDiscriminator("doc.type == 'account'")
public class Account extends CouchDbDocument {

	private static final long serialVersionUID = 6068195162426591887L;
	private String type;
	private String accountType;
	private String questionSet;
	private String name;
	private String address;
	private String channel;
	private Double latitude;
	private Double longitude;
	private String surveyStartDate;
	private String surveyEndDate;

	public Account() {
	}

	public Account(String accountType, String questionSet, String name, String address, String channel, Double latitude,
			Double longitude, String surveyStartDate, String surveyEndDate) {
		this.type = "account";
		this.accountType = accountType;
		this.questionSet = questionSet;
		this.name = name;
		this.address = address;
		this.channel = channel;
		this.latitude = latitude;
		this.longitude = longitude;
		this.surveyStartDate = surveyStartDate;
		this.surveyEndDate = surveyEndDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getQuestionSet() {
		return questionSet;
	}

	public void setQuestionSet(String questionSet) {
		this.questionSet = questionSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getSurveyStartDate() {
		return surveyStartDate;
	}

	public void setSurveyStartDate(String surveyStartDate) {
		this.surveyStartDate = surveyStartDate;
	}

	public String getSurveyEndDate() {
		return surveyEndDate;
	}

	public void setSurveyEndDate(String surveyEndDate) {
		this.surveyEndDate = surveyEndDate;
	}

}
