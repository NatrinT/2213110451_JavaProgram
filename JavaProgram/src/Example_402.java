import javax.swing.*;

public class Example_402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String INemail = JOptionPane.showInputDialog("Input your email:");
		while (INemail.startsWith("@")||INemail.contains(" ")) {
			INemail = JOptionPane.showInputDialog("Input your email, again:");
		}
		INemail = INemail.toLowerCase();
		/*if(INemail.endsWith("@gmail.com")||INemail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+INemail);
		}else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}*/
		boolean check = INemail.endsWith("@gmail.com")||INemail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (check)?"Your e-mail is "
		+INemail:"Your e-mail is not hotmail or gmail dot com");
	}

}
