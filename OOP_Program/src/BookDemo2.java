import javax.swing.*;

public class BookDemo2 {
	Book1 book;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Input author name: ");
		String email = JOptionPane.showInputDialog("Input author e-mail: ");
		String title = JOptionPane.showInputDialog("Input book title: ");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		Book1 book = new Book1(title,new Author1(name,email),page);
		if(JOptionPane.showConfirmDialog(null, "Is the page correct?","Confirm",JOptionPane.YES_NO_OPTION)==1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page, again: "));
			book.setPage(page);
		}
		
		JOptionPane.showMessageDialog(null, book);
	}

}
