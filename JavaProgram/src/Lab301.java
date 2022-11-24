import javax.swing.*;
import java.text.*;

public class Lab301 {
	static final int pricePerson = 299;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberOfCus = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = numberOfCus*pricePerson;
		int memberCard;
		do {
		memberCard = JOptionPane.showConfirmDialog(null, "Total price is "+totalPrice+"baht."+
		"\nDo you have a member card?");
		}while (memberCard==2);
		if (memberCard==0) {
			totalPrice = totalPrice*90/100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalPrice)+" baht.");
		}
		else if (memberCard==1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalPrice)+" baht.");
		}

	}

}
