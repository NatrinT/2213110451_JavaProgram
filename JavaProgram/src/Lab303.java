import java.util.Random;
import javax.swing.*;
import java.text.*;

public class Lab303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+
				"\nInput money to withdraw:"));
		if(withdraw>=balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw>20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw%100!=0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+withdraw+" baht.",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw<=20000) {
			int thousand = withdraw/1000;
			int fivehunderd = withdraw%1000;
			int hunderd = fivehunderd%500;
			JOptionPane.showMessageDialog(null, "Your withdraw "+frm.format(withdraw)+" baht."+
			"\n1,000 = "+thousand+"\n500 = "+(fivehunderd/500)+"\n100 = "+(hunderd/100));	
		}
		

	}

}
