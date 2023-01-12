import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame{

	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	private JLabel lblLenght,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimeter;
	
	public TestGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		//setBounds(500, 500, WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lblLenght = new JLabel("Enter the lenght:",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the Width:",SwingConstants.RIGHT);
		lblArea = new JLabel("Enter the Area:",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Enter the Perimeter:",SwingConstants.RIGHT);
		
		/*txtLength = new JTextField(10);
		txtWidth = new JTextField(10);
		txtArea = new JTextField(10);
		txtPerimeter = new JTextField(10);
		*/
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLenght);add(txtLength);
		add(lblArea);
		add(lblWidth);
		add(lblPerimeter);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGUI prog = new TestGUI();
	}

}
