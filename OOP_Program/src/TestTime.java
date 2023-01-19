
public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(1,2,3);
		System.out.println(t1);
		Time t2 = new Time();
		System.out.println(t2);
		
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println("\n"+t1);
		
		t1.setTime(58, 59, 23);
		System.out.println("\n"+t1);
		
		System.out.println(t1.nextSecond());
		System.out.println(t1.nextSecond().nextSecond().nextSecond());
	}

}
