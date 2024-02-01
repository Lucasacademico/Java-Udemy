package entities;

public class rent {

	private String email;
	private String name;
	
	public rent(String name, String email) {
		this.name = name;
		this.email = email;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return name + ", " + email;
	}
}
