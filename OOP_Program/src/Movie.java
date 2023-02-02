
public class Movie {
	private String id;
	private String name;
	Director director;
	
	public Movie(String id,String name,Director director) {
		this.id=id;
		this.name=name;
		this.director=director;
	}
	
	public Movie() {
		this.id="";
	    this.name="";
		this.director=null;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Director getDirector() {
		return this.director;
	}
	
	public void setDirector() {
		this.director=director;
	}
	
	public String toString() {
		return getId()+" "+getName()+" direct by "+director;
	}
}
