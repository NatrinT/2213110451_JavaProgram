import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int count = scn.nextInt();
		StudentScore[] student = new StudentScore[count];
		for (int i = 0; i < student.length; i++) {
			student[i] = new StudentScore();
			System.out.println("-----------------------------");
			System.out.print("Input student name : ");
			student[i].setName(scn.next());
			System.out.print("Input student score : ");
			student[i].setScore(scn.nextInt());
			while (!student[i].checkScore()) {
				System.out.print("Input score, again : ");
				student[i].setScore(scn.nextInt());
			}
		} // end of for
		System.out.println("-----------------------------");
		for (StudentScore std : student) {
			if (std.isPass()) {
				System.out.println(">> " + std.getName() + " get grade " + findGrade(std.getScore()));
			}
		}
	}

	public static String findGrade(int score) {
		return score >= 0 && score < 50 ? "F"
				: score >= 50 && score < 55 ? "D"
						: score >= 55 && score < 60 ? "D+"
								: score >= 60 && score < 65 ? "C"
										: score >= 65 && score < 70 ? "C+"
												: score >= 70 && score < 75 ? "B"
														: score >= 75 && score < 80 ? "B+" : "A";
	}

}
