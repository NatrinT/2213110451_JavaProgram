import javax.swing.*;
public class Lab_Example602_2 {

	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean chk=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter a department name");
		for (int i =0;i<deptName.length;i++) {
			if(name.equalsIgnoreCase(deptName[i])) {
				chk=true;
				name=deptName[i];
			}
		}
		JOptionPane.showMessageDialog(null, name+" was "+(chk?"":"not ")+" found in the list.");
	}

}
