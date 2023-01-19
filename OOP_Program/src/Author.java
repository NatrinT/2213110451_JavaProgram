
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	public Author(String name,String email) {
		this.name=name;
		this.email=email;
	}
	public Author() {
		name=email="";
		gender=' ';
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		return gender=='M'?"Male":gender=='F'?"Female":null;
	}
	public String toString() {
		return "Author name: "+getName()+" ("+getEmail()+";"+getGenderName()+")";
	}
}
