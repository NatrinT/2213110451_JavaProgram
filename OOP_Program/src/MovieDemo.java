import java.util.*;

public class MovieDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Input Movie id   : ");
		String id = scn.nextLine();
		System.out.print("Input Movie name : ");
		String name = scn.nextLine();
		System.out.println();
		
		System.out.print("Input director name       : ");
		String directorname = scn.nextLine();
		System.out.print("Input director e-mail     : ");
		String email = scn.nextLine();
		System.out.print("Input director gender     : ");
		char gender = scn.next().toLowerCase().charAt(0);
		while (gender!='m'&&gender!='f') {
			System.out.print("Input director gender, again : ");
			gender = scn.next().toLowerCase().charAt(0);
		}
		System.out.println();
		
		System.out.print("Input movie theater no.      : ");
		int theaterNO = scn.nextInt();
		while(!(theaterNO>0&&theaterNO<=15)) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNO = scn.nextInt();
		}
		System.out.println();
		
		Theater theater = new Theater(id,name,new Director(directorname, email, gender),theaterNO);
		System.out.println(theater);
	}

}
