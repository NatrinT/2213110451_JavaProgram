import java.util.*;

public class Lab602 {
	static Scanner scan = new Scanner(System.in);
	static double sum=0;
	static double averageNum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] inputScore = new double[5];
		for (int i=0;i<inputScore.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			inputScore[i]=scan.nextDouble();
			sum+=inputScore[i];
		}
		System.out.println();
		averageNum = sum/(inputScore.length);
		System.out.println("Average of "+inputScore.length+" Student is "+averageNum);
		for (int i=0;i<inputScore.length;i++) {
		if (inputScore[i]>averageNum) {
			System.out.println("> Student "+(i+1)+" ("+inputScore[i]+" )");
		}
		}
		
	}

}
