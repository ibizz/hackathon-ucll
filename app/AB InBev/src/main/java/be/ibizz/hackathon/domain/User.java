package be.ibizz.hackathon.domain;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

/**
 * Een user is een gebruiker van het system. Bij de start van de hackathon wordt deze nog niet gebruikt. 
 * Jullie kunnen deze wel gebruiken en verder uitbreiden indien gewenst.
 */
@TypeDiscriminator("doc.type == 'user'")
public class User extends CouchDbDocument{

	private static final long serialVersionUID = 4564262641209820537L;
	
	private String type;
	private String firstName;
	private String lastName;
	
	public User() {
	}
	
	public User(String firstName, String lastName) {
		this.type = "user";
		this.firstName = firstName;
		this.lastName = lastName;
	}

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
