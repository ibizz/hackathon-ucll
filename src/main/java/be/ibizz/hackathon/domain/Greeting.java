package be.ibizz.hackathon.domain;

import java.util.Objects;

public class Greeting {

	private String message;
	
	public Greeting(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(message);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {  return false; }
	    if (getClass() != obj.getClass()) { return false; }
	    final Greeting other = (Greeting) obj;
	    return  Objects.equals(this.message, other.message);
	}
	
	
	
}
