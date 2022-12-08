import java.util.*;

public class Lab505 {

	static String StudentID;
	static int SubjectID;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputStudent();
		
	}
	public static void inputStudent() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		String StudentID = scn.next();
		System.out.print("Enter Subject Id: ");
		int SubjectID = scn.nextInt();
		boolean chk = isLength(StudentID,SubjectID);
		while(chk==false) {
			System.out.print("Enter Student Id: ");
			StudentID = scn.next();
			System.out.println("Enter Subject Id: ");
			SubjectID = scn.nextInt();
		}
		displayData(isITStudent(StudentID),isITSubject(SubjectID),StudentID);
	}
	public static boolean isLength(String student,int subject) {
		String NewSubjectID = subject+"";
		if(student.length()==10&&NewSubjectID.length()==7) return true;
	else return false;
	}
	
	public static boolean isITStudent(String ID) {
		if(ID.substring(0,6).equals("211311")) {
			return true;
		}
		else return false;
	}
	
	public static boolean isITSubject(int ID) {
		String NewSubjectID = ID+""; 
		if(NewSubjectID.substring(0,2).equals("21")&&NewSubjectID.charAt(4)=='1') return true;
		else return false;
	}
	
	public static void displayData(boolean ITStu,boolean ITSub,String StudentID) {
		System.out.println();
		String empty="";
		//if(ITStu!=true) empty = "not ";
		//else if(ITSub!=true) empty = "not ";
		System.out.println("Student id: "+StudentID+" is "+ ((ITStu!=true)?"not ":"") +
				"1st year student in IT\n"+((ITSub!=true)?"not ":"")+"Enroll in courses for Year 1");
	}
	
}
