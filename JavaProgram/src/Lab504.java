import java.text.*;
import java.util.Scanner;

public class Lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = scn.nextLine();
		int spacebar = fullname.indexOf(' ');
		String firstname = fullname.substring(0, spacebar);
		System.out.println(abbereviatName(fullname)+ firstname);
	}
	public static String abbereviatName(String fullname) {
		String namee="";
		for(int i =0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				namee = (namee+fullname.charAt(i+1)).toUpperCase();
				namee = namee+".";
			}
		}
		return namee;
	}
}
