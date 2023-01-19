import java.util.Scanner;

public class TestAuthorDemo2 {
	
	
	public static void main(String[] args) {
		
		Author[] ath = new Author[4];
		for(int i =0 ;i<ath.length;i++) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Infomation Author "+(i+1));
			System.out.println("--------------------------------------");
			System.out.print("Input author name   : ");
			String name = scn.nextLine();
			System.out.print("Input author e-mail : ");
			String email = scn.nextLine();
			System.out.println("--------------------------------------");
		    ath[i] = new Author(name,email);
		}
		int i=0;
		for(Author _ar: ath) {
			System.out.print(++i+". "+_ar.getName()+" ("+_ar.getEmail()+")\n");
		}
	}

}
