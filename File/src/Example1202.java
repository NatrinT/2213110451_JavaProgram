import java.util.Scanner;
import java.io.*;

public class Example1202 {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.print("Input Section : ");
		int sec = scn.nextInt();
		Header(sec);
		showListStudent(sec);
	}

	public static void showListStudent(int sec) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			double midtermSC = Double.parseDouble(data[4]);
			double finalSC = Double.parseDouble(data[5]);
			String gradeResult = findResult(midtermSC, finalSC);
			if (Integer.parseInt(data[3]) == sec) {
				System.out.println(data[0] + " " + data[2] + "     \t" + midtermSC + "\t" + finalSC + "\t"+gradeResult);
			}
		}
		read.close();
	}

	public static void Header(int sec) {
		System.out.println("******************************************************************");
		System.out.println("\t\tList of Data for Section " + sec);
		System.out.println("******************************************************************");
	}

	public static String findResult(double mid,double finalsc) {
		double total = mid+finalsc;
		if(total<=40) return "Fail";
		else return "Pass";
	}

}
