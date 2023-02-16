import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ATMChecking extends ATMData{
	private int money;
	private int moneyInAc;
	
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber,password);
		this.money=money;
	}
	
	public boolean checkBookBank() throws IOException{
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		while(read.hasNext()) {
			String ID = read.next();
			String pass = read.next();
			moneyInAc = read.nextInt();
			if(ID.equals(super.getID())&&pass.equals(super.getPass())&&this.money>=moneyInAc) 
				return true;
		}
		read.close();
		return false;
	}
	
	public void show() {
		if(true) {
		DecimalFormat fm = new DecimalFormat("#,###.00");
		System.out.println("You drawing for "+fm.format(this.money)+", get");
		int thousand = this.money/1000;
		int fivehundred = thousand%1000;
		int hunderd = fivehundred%500;
		System.out.println("\t1000 = "+thousand+"\n\t500 = "+(fivehundred/500)+"\n\t100 = "+(hunderd/100));
		System.out.println("Your balance is "+fm.format(moneyInAc-this.money)+" Baht.");
		}else System.out.println("Sorry, your id or password is wrong, or your amount not enough.");
	}
}
