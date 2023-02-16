
public class ATMData {
	private String accountNumber;
	private String password;
	
	public ATMData(String accountNum,String password) {
		accountNumber=accountNum;
		this.password=password;
	}
	public String getID() {
		return accountNumber;
	}
	
	public String getPass() {
		return this.password;
	}
}
