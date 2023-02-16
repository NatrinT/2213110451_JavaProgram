import java.util.*;

public class ATMBanking {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter account number : ");
		String account = scn.next();
		while(account.charAt(1)!='-'&&account.charAt(5)!='-'&&account.charAt(9)!='-'&&account.charAt(12)!='-'&&account.length()!=14) {
			System.out.print("Input wrong type, Enter account number : ");
			account = scn.next();
		}
		System.out.print("Enter password : ");
		String pass = scn.next();
		while(pass.length()!=4) {
			System.out.print("Enter password : ");
			pass = scn.next();
		}
		System.out.print("Enter money : ");
		int money = scn.nextInt();
		while(money%100!=0||money<0) {
			System.out.print("Enter money : ");
			money = scn.nextInt();
		}
		
		ATMChecking bank = new ATMChecking(account, pass, money);
		bank.show();
		
	}

}
