
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students Jrp = new Students("Jiraphat HuaKom","111/52 happy ave");
		System.out.println(Jrp);
		
		Jrp.setAddress("65 Phattanakran");
		System.out.println(Jrp);
		System.out.println(Jrp.getAddress());
		System.out.println(Jrp.getName());
		
		Jrp.addCourseGrade("INT107", 25);
		Jrp.addCourseGrade("HUM108", 78);
		Jrp.addCourseGrade("MSC110", 4);
		Jrp.printGrades();
		
		System.out.printf("The average grade is %.2f%n",Jrp.getAverageGrade());
	}

}
