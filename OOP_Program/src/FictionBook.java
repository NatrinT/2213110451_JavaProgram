
public class FictionBook implements Author5, Book5 {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;

	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
		this.email=null;
		this.author_name=null;
	}
	
	public void setAuthorName(String name) {
		author_name=name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public boolean checkFormatName() {
		return (author_name.trim().contains(" "))?true:false;
	}
	
	@Override
	public String getLastName() {
		String[] Lname = author_name.split(" ");
		return Lname[1];
	}
	 
	@Override
	public String getFirstName() {
		String[] Fname = author_name.split(" ");
		return Fname[0];
	}
	
	@Override
	public boolean checkEmail() {
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
			return true;
		}else return false;
	}
	
	@Override
	public int totalPublicYear() {
		return 2023-this.publicYear;
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
	
	public String toString() {
		return getTitle()+" write by "+author_name.charAt(0)+"."+getFirstName()+" ("+this.email+")\nPublished for "+totalPublicYear()+" years.";
	}
}
