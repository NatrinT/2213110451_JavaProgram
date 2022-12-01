import java.util.*;
import javax.swing.*;

public class Example_403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence = JOptionPane.showInputDialog("Input a sentence : ");
		while(!sentence.endsWith(".")) {
			JOptionPane.showMessageDialog(null ,"Input a sentence, again: ");
		}
		int spaceOfWord=0;
		for(int i =0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceOfWord++;
			}
		}
		JOptionPane.showMessageDialog(null ,"This sentence has "+spaceOfWord+" spacebar.");
		JOptionPane.showMessageDialog(null ,"This sentence has "+(spaceOfWord+1)+" spacebar.");
	}

}
