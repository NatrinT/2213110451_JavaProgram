import javax.swing.JOptionPane;

public class Lab_Example602_1 {
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double ItemPrice =0;
	static boolean ValidItem = false;
	static int ItemOrder;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputItem();

	}
	public static void inputItem() {
		ItemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter Item nuber to order "));
		if(checkItem(ItemOrder)) {
			System.out.println("Item "+ItemOrder+" is "+ItemPrice);
		}else System.out.println("Invalid Item");
	}
	public static boolean checkItem(int ItemOrder) {
		for (int i = 0; i < validValues.length; i++) {
			if(ItemOrder==validValues[i]) {
				ValidItem=true;
				ItemPrice=price[i];
			}
		}
		return ValidItem;
	}
}
