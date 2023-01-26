
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	public Date() {
		dMonth=dDay=1;
		dYear=1900;
	}
	
	public Date(int month,int day,int year) {
		setDate(month, day, year);
	}
	
	public void setDate(int month,int day,int year) {
		dMonth=month;
		dDay=day;
		dYear=year;
	}
	
	public int getMonth() {
		return dMonth;
	}
	
	public int getDay() {
		return dDay;
	}
	
	public int getYear() {
		return dYear;
	}
	
	public String toString() {
		return String.format("%02d-%02d-%04d",dMonth,dDay,dYear );
	}
}
