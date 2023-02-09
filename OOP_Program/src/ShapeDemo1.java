import java.util.*;

public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Input radius ");
		double radius = scn.nextDouble();
		System.out.print("Input height ");
		double height = scn.nextDouble();
		Circle circle = new Circle(radius, null);
		System.out.println();
		System.out.println("Circle["+circle+"]");
		System.out.println("Circle[area="+circle.getArea()+"]");
		
		System.out.println();
		Cylinder cylin = new Cylinder(radius, height);
		System.out.println("Cylinder["+cylin+"]");
		System.out.println("Cylinder[area="+cylin.getArea()+"]");
		System.out.println("Cylinder[volume="+cylin.getVolume()+"]");
	}

}
