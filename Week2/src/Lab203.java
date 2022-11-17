import java.util.*;

public class Lab203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Two Integers(a,b): ");
		int Fnumber = scn.nextInt();
		int Snumber = scn.nextInt();
		System.out.println("Sum of two integers:"+(Fnumber+Snumber));
		int count = 0;
		int num = Fnumber+Snumber;
	    while (num != 0) {
	      num /= 10;
	      ++count;
	    }
	    System.out.println("Digit number of sum of said two integers:"+count);
	}

}
