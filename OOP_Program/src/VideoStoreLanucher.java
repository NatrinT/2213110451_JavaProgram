
public class VideoStoreLanucher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video vid1 = new Video();
		vid1.setTitle("The God Father");
		
		vid1.addRating(3);
		vid1.addRating(2);
		vid1.addRating(5);
		
		System.out.println(vid1.getTitle()+" : "+vid1.getRating());
		
		vid1.checkedOut();
		getStatus(vid1);
		vid1.returnToStore();
		getStatus(vid1);
	}
	
	public static void getStatus(Video v) {
		if(v.isCheckedOut()) {
			System.out.println("\'"+v.getTitle()+"\' is checked out.");
		}else System.out.println("\'"+v.getTitle()+"\' is on shelves.");
		
	}

}
