import java.util.*;
public class Lab607 {
	static String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December" };
	static int count[] = new int[12];
	public static void main(String[] args) {
		inputBirthDate();
	}
	public static void inputBirthDate() {
		Scanner scan = new Scanner(System.in);
		int bmonth;
		String BirthDate;
		for(int i=0;i<5;i++) {
			System.out.print("Enter BirthDate "+(i+1)+" :");
			BirthDate = scan.nextLine();
			bmonth = checkBirthDate(BirthDate);
			count[bmonth]++;
		}
		displayCountBday(count);
	}
	public static int checkBirthDate(String bd) {
		int month = Integer.parseInt(bd.substring(3,5));
		return month-1;
	}
	public static void displayCountBday(int[] count) {
		System.out.println();
		for(int i =0;i<count.length;i++) {
			System.out.println(month[i]+" ["+count[i]+" people");
		}
	}
}
