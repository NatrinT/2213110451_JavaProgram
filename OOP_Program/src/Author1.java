
public class Author1 {
	private String name;
	private String email;
	
	public Author1(String name,String email) {
		this.name=name;
		this.email=email;
	}
	
	public Author1() {
		this.name="";
		this.email="";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return getName()+" ("+getEmail()+")";
	}
}
