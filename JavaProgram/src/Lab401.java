import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullName = scan.nextLine();
		int check = fullName.indexOf(' ');
		
		if(check==-1) {
			System.out.println("Incorrect Name");
		}
		else {
			String firstname = fullName.substring(0, check);
			String lastname = fullName.substring(check+1);
			System.out.println("First Name: "+firstname.toUpperCase()+
					"\nLast Name: "+lastname.toLowerCase());
		}
	}

}
