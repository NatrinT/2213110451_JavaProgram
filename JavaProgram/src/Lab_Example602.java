import javax.swing.*;

public class Lab_Example602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		double ItemPrice =0;
		boolean ValidItem = false;
		int ItemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter Item nuber to order "));
		for (int i = 0; i < validValues.length; i++) {
			if(ItemOrder==validValues[i]) {
				ValidItem=true;
				ItemPrice=price[i];
			}
		}
		if(ValidItem) {
			System.out.println("Item "+ItemOrder+" is "+ItemPrice);
		}else System.out.println("Invalid Item");
	}

}
