import java.util.Scanner;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Input author name   : ");
		String name = scn.nextLine();
		System.out.print("Input author e-mail : ");
		String email = scn.nextLine();
		System.out.print("Input author gender : ");
		char gender = scn.next().toUpperCase().charAt(0);
		Author at = new Author(name,email,gender);
		
		System.out.println("\n"+at);
	}

}
