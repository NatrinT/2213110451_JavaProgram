import java.util.*;
import java.text.*;

public class SalespersonSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;

		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int sales=0;
		double salary=0;
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if(sales==SENTINEL)break;
			salary=1000+(sales*COMMISSION_RATE);
			System.out.println("Salary is: $"+frm.format(salary));
			System.out.println();
		}
		System.out.println("bye");
		

	}

}
