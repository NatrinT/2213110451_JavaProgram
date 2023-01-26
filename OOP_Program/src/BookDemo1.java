import java.util.*;

public class BookDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Input author name   : ");
		String name = scn.nextLine();
		System.out.print("Input author e-mail : ");
		String email = scn.nextLine();
		Author1 author = new Author1(name,email);
		
		System.out.println();
		System.out.print("Input book title : ");
		String title = scn.nextLine();
		System.out.print("Input book page  : ");
		int page = scn.nextInt();
		Book1 book = new Book1(title,author,page);
		
		System.out.println();
		System.out.println(book);
	}

}
