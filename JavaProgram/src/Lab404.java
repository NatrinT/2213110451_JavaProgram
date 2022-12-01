import java.util.*;

public class Lab404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Text: ");
		String text = scan.nextLine().toLowerCase();
		char Txtchr;
		String BacktoFront = "";
		 for(int i=0;i<text.length();i++) {
			 Txtchr = text.charAt(i);
				BacktoFront = Txtchr+BacktoFront;
		 }
		 System.out.print(BacktoFront);
		 if(BacktoFront==text) {
			 System.out.print("It is palindrome");
		 }
		 else {
			 System.out.print("It is not palindrome");
		 }

	}

}
