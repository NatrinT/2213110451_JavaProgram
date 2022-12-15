import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {25,78,41,22,36,85,37};
		int inputIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while(checkIndex(nums,inputIndex)==false) {
			inputIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
		}
		int current = currentData(nums,inputIndex);
		int prev = prevData(nums,inputIndex);
		int next = nextData(nums,inputIndex);
		JOptionPane.showMessageDialog(null, 
				"Current data, nums["+inputIndex+"] is "+nums[current]+
				((prev<0)?"\nNo previous data":"\nPrevious data, nums["+(inputIndex-1)+"] is "+nums[prev])+
				((next>nums.length-1)?"\nNo next data":"\nNext data, nums["+(inputIndex+1)+"] is "+nums[next]));
	}
	public static boolean checkIndex(int[] nums,int index) {
		return (index>=0&&index<(nums.length))?true:false;
	}
	
	public static int currentData(int[] nums,int index) {
		return index;
	}
	
	public static int prevData(int[] nums,int index) {
		return index-1;
	}
	public static int nextData(int[] nums,int index) {
		return index+1;
	}
}
