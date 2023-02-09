import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
				Cylinder[] cylin = new Cylinder[5];
				for(int i =0;i<cylin.length;i++) {
					double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius"));
					double height = Double.parseDouble(JOptionPane.showInputDialog("Input height"));
					cylin[i] = new Cylinder(radius,height);
				}
				System.out.println();
				int i =0;
				for(Cylinder cylin_ : cylin) {
					i++;
					JOptionPane.showMessageDialog(null,"Cylinder "+i+", volume="+cylin_.getVolume());
				}
			}

		

}


