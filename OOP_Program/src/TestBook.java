import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Book bk1 = new Book();
		System.out.print("Input book title   : " );
		bk1.setTitle(scn.nextLine());
		System.out.print("Input book price   : " );
		bk1.setPrice(scn.nextFloat());
		System.out.print("Input publish year : " );
		bk1.setPublishYear(scn.nextInt());
		
		System.out.println("\n"+bk1);
	}

}
