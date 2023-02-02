
public class Theater extends Movie{
	private int theaterNo;
	
	public Theater(String id,String name,Director director,int theaterNo) {
		super(id,name,director);
		this.theaterNo=theaterNo;
	}
	
	public Theater() {
		super();
		this.theaterNo=0;
	}
	
	public String getTheaterName() {
		return theaterNo<=11&&theaterNo>=1?"Basic Theater":theaterNo>=12&&theaterNo<=14?"Sweet Theater":theaterNo>=15?"Preminum Theather":null;
	}
	
	@Override
	public String toString() {
		return getTheaterName()+": "+super.toString();
	}
}
