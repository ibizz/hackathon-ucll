package be.ibizz.hackathon.domain;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

@TypeDiscriminator("doc.type == 'account'")
public class Account extends CouchDbDocument {

	private static final long serialVersionUID = 6068195162426591887L;
	private String type;
	private String questionSet;
	private String name;
	private String address;
	private String channel;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
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

}
