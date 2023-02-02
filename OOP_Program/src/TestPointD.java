
public class TestPointD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D();
		System.out.println("Default x, y of Point2D = " + p1);
		p1.setXY(10, 11);
		System.out.println("Default x, y of Point2D = " + p1);
		System.out.println("Default x, y of Point2D = " + p1.getX() + " " + p1.getY());
		System.out.println("Default x, y of Point2D = " + p1.getXY()[0] + " " + p1.getXY()[1]);

		System.out.println();

		Point3D p2 = new Point3D();
		System.out.println("Default x, y, z of Point3D = " + p2);
		p2.setXYZ(14, 12, 7);
		System.out.println("Default x, y, z of Point3D = " + p2);
		System.out.println("Default x, y, z of Point3D = " + p2.getX() + " " + p2.getY() + " " + p2.getZ());
		System.out.println("Default x, y, z of Point3D = " + p2.getXYZ()[0] + " " + p2.getXYZ()[1] + " " + p2.getXYZ()[2]);
	}

}
