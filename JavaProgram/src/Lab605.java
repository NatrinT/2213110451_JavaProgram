import javax.swing.*;
public class Lab605 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[5];
		for(int i =0;i<number.length;i++) {
			number[i]=Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" :"));
		}
		showEven(number);
		showOdd(number);
	}
	
	public static void showEven(int[] nums) {
		String evennum = "";
		for(int _num:nums) {
			if(_num%2==0) { 
				evennum+=""+_num+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+evennum);
	}
	
	public static void showOdd(int[] nums) {
		String evenodd = "";
		for(int _num:nums) {
			if(_num%2!=0) { 
				evenodd+=""+_num+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number:\n"+evenodd);
	}
}
