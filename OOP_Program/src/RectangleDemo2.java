import java.util.*;

public class RectangleDemo2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Input width : ");
		double width = scn.nextDouble();
		System.out.print("Input length : ");
		double length = scn.nextDouble();
		Rectangle2 rec = new Rectangle2(width, length);
		System.out.println(rec);
		System.out.println("Area of Rectangle is "+rec.getArea());
	}

}
