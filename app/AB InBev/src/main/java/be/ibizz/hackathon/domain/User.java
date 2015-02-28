package be.ibizz.hackathon.domain;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

@TypeDiscriminator("doc.type == 'user'")
public class User extends CouchDbDocument{

	private static final long serialVersionUID = 4564262641209820537L;
	
	private String type;
	private String firstName;
	private String lastName;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}