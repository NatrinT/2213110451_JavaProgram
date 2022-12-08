import javax.swing.*;

public class Lab502 {
	static String email;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputemail();

	}
	public static void checkemailerror(String email) {
		while(email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog
					("Input your email, again:");
		}
		email = email.toLowerCase();

		JOptionPane.showMessageDialog(null, 
				checkemail(email)?"Your e-mail is "+email:"Your e-mail is not hotmail or gmail dot com ");
	}
	public static boolean checkemail(String email) {
		if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com"))
		return true;
    	else return false;
	}
	public static void inputemail() {
		String answer = "";
		do {
			email = JOptionPane.showInputDialog("Input your e-mail");
			checkemailerror(email);
			answer = JOptionPane.showInputDialog("Input your e-mail");
		}while(answer.equalsIgnoreCase("y"));
	}

}
