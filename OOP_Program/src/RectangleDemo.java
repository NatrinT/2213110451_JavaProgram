import javax.swing.*;

public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double heigth = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		String color = JOptionPane.showInputDialog("Input color");
		Rectangle rec = new Rectangle(width, heigth, color);
		JOptionPane.showMessageDialog(null, rec+"\nArea of Rectangle is "+rec.getArea());
	}

}
