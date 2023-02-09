import java.util.*;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Input book name    : ");
		String bookName = scn.nextLine();
		System.out.print("Input public year  : ");
		int publicYear = scn.nextInt();
		FictionBook book = new FictionBook(bookName, publicYear);
 
		System.out.print("Input author name  : ");
		String authorName = scn.next();
		book.setAuthorName(authorName);
		while (!book.checkFormatName()) {
			System.out.print("Input author name,again  : ");
			authorName = scn.next();
		}
		System.out.print("Input author email  : ");
		String authorEmail = scn.next();
		book.setEmail(authorEmail);
		while(!book.checkEmail()) {
			System.out.print("Input author email,again : ");
			authorEmail = scn.next();
		}

	}

}
