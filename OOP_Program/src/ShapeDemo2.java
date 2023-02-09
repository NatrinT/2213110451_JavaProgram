import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder[] cylin = new Cylinder[5];
		Scanner scn = new Scanner(System.in);
		for(int i =0;i<cylin.length;i++) {
			System.out.print("Input radius and height : ");
			double radius = scn.nextDouble();
			double height = scn.nextDouble();
			cylin[i] = new Cylinder(radius,height);
		}
		System.out.println();
		int i =0;
		for(Cylinder cylin_ : cylin) {
			i++;
			System.out.println("Cylinder "+i+", volume="+cylin_.getVolume());
		}
	}

}
