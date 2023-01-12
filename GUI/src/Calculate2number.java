import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Calculate2number extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;
	private JLabel lblResult;
	private JLabel lblOperator;
	private JLabel lblShowDigit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate2number frame = new Calculate2number();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculate2number() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 470);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(45, 40, 89, 14);
		contentPane.add(lblNumber1);

		txtNumber1 = new JTextField("");
		txtNumber1.setBounds(166, 36, 133, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(45, 85, 100, 14);
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField("");
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(166, 82, 133, 20);
		contentPane.add(txtNumber2);

		lblResult = new JLabel("Result",SwingConstants.RIGHT);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResult.setBounds(139, 319, 272, 23);
		contentPane.add(lblResult);

		lblOperator = new JLabel("Operator");
		lblOperator.setBounds(45, 130, 64, 14);
		contentPane.add(lblOperator);

		final JComboBox cbOperator = new JComboBox();
		cbOperator.setBounds(166, 130, 174, 18);
		cbOperator.addItem("None choose your option");
		cbOperator.addItem("+");
		cbOperator.addItem("-");
		cbOperator.addItem("*");
		cbOperator.addItem("/");
		contentPane.add(cbOperator);
		
		lblShowDigit = new JLabel("Operator");
		lblShowDigit.setBounds(45, 175, 64, 14);
		contentPane.add(lblShowDigit);
		
		final JRadioButton radiobtn1Digit = new JRadioButton("1 Digit");
		radiobtn1Digit.setBounds(166, 175, 109, 23);
		contentPane.add(radiobtn1Digit);
		
		final JRadioButton radiobtn2Digit = new JRadioButton("2 Digit");
		radiobtn2Digit.setBounds(166, 221, 109, 23);
		contentPane.add(radiobtn2Digit);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(radiobtn1Digit);
		grp.add(radiobtn2Digit);
		
		JLabel lblShowDialog = new JLabel("Option to show");
		lblShowDialog.setBounds(45, 276, 89, 14);
		contentPane.add(lblShowDialog);
		
		final JCheckBox chckbxShowDialog = new JCheckBox("Show result at Dialog");
		chckbxShowDialog.setBounds(166, 272, 150, 23);
		contentPane.add(chckbxShowDialog);
		

		final JButton btnOkBotton = new JButton("OK");
		btnOkBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				String operator;
				if (e.getSource() == btnOkBotton) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String) cbOperator.getSelectedItem();
					if (operator.equals("+"))
						sum = num1 + num2;
					if (operator.equals("-"))
						sum = num1 - num2;
					if (operator.equals("*"))
						sum = num1 * num2;
					if (operator.equals("/"))
						sum = num1 / num2;
					
					DecimalFormat frmnum = null;
					if(radiobtn1Digit.isSelected()) {
						frmnum = new DecimalFormat("#,###.0");
					}
					else if(radiobtn2Digit.isSelected()) {
						frmnum = new DecimalFormat("#,###.00");
					}
					
					if(chckbxShowDialog.isSelected()) JOptionPane.showMessageDialog(null, "Result is : "+frmnum.format(sum));

					lblResult.setText(frmnum.format(sum));
					if (operator.equals("None choose your option"))
						lblResult.setText("Please choose operator");
					if(!radiobtn1Digit.isSelected()&&!radiobtn2Digit.isSelected())
						lblResult.setText("Please choose digit");
				}
				
			}
		});
		btnOkBotton.setBounds(108, 379, 89, 23);
		contentPane.add(btnOkBotton);

		JButton btnExitBotton = new JButton("Exit");
		btnExitBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExitBotton.setBounds(227, 379, 89, 23);
		contentPane.add(btnExitBotton);
		
		
		

	}
}
