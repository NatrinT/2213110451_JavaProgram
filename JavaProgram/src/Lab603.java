import java.util.*;

public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	static int[] NumofInt= {78,36,58,41,25,92,75};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input index of array : ");
		int indexofArray = scan.nextInt();
		while(indexofArray<0||indexofArray>(NumofInt.length+1)) {
			System.out.print("Input index of array, again : ");
			indexofArray = scan.nextInt();	
		}
		System.out.println();
		System.out.println("Value in current index is "+(NumofInt[indexofArray])/*"/nValue in next index is "
		+(NumofInt[indexofArray+1])*/);
		if(indexofArray==(NumofInt.length-1)) {
			System.out.println("Sorry This is last index");
		}else System.out.println("Value in next index is "+(NumofInt[indexofArray+1]));
	}

}
