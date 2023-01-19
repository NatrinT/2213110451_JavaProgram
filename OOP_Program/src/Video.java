
public class Video {
	private String title;
	private boolean checkOut=false;
	private double averageRating;
	private int ratingSum=0;
	private int ratingCount=0;
	
	public void setTitle(String iTiltle) {
		title=iTiltle;		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void addRating(int rate) {
		ratingSum+=rate;
		ratingCount+=1;
		averageRating=ratingSum/ratingCount;
	}
	
	public double getRating() {
		return averageRating;
	}
	
	public void checkedOut() {
		checkOut=true;
	}
	
	public void returnToStore() {
		checkOut=false;
	}
	
	public boolean isCheckedOut() {
		return checkOut;
	}
	
}
