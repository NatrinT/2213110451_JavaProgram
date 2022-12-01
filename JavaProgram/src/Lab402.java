import java.util.Scanner;

public class Lab402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int n=0;
		for(int i =0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				System.out.println(sentence.substring(n,i));
				n=i+1;
			}
		}
		System.out.println(sentence.substring(n));

	}

}
