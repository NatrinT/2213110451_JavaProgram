import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConversion extends JFrame {
	private JLabel lblCelsius;
	private JLabel lblFahrenheit;

	private JTextField tfCelsius;
	private JTextField tfFahrenheit;

	private static final double FTOC = 5.0 / 9.0;
	private static final double CTOF = 9.0 / 5.0;
	private static final int OFFSET = 32;

	public TempConversion() {

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4));

		lblCelsius = new JLabel("Temp in Celsius:");
		lblFahrenheit = new JLabel("Temp in Fahrenheit:");

		tfCelsius = new JTextField();
		tfFahrenheit = new JTextField();

		c.add(lblCelsius);
		c.add(tfCelsius);
		c.add(lblFahrenheit);
		c.add(tfFahrenheit);

		CelHandler celsiusHandler = new CelHandler();
		tfCelsius.addActionListener(celsiusHandler);
		FahHandler fahrenheitHandler = new FahHandler();
		tfFahrenheit.addActionListener(fahrenheitHandler);

		setSize(500, 100);
		setTitle("Conversion Temp");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private class CelHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit;
			celsius = Double.parseDouble(tfCelsius.getText());
			fahrenheit = celsius * CTOF + OFFSET;
			tfFahrenheit.setText(String.format("%.2f", fahrenheit));
		}
	}
	private class FahHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit;
			fahrenheit = Double.parseDouble(tfFahrenheit.getText());
			celsius = (fahrenheit - OFFSET)* FTOC;
			tfCelsius.setText(String.format("%.2f", celsius));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConversion tempCon = new TempConversion();
	}

}
