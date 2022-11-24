import java.util.*;
import java.text.*;

public class PensionContributionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare constants
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		// Declare variables
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int salary, age; // to be input
		int contributableSalary;
		System.out.print("Enter the monthly salary: $");
		salary = scan.nextInt();
		System.out.print("Enter the age: ");
		age = scan.nextInt();
		double employeeContribution, employerContribution, totalContribution;
		// Check the contribution cap
		contributableSalary = salary-6000;
		if (salary>6000) {
			salary=salary-contributableSalary;
		}
		// Compute various contributions in "double" using a nested-if to handle 4 cases
		if (age <= 55) {
			employeeContribution = salary*EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = salary*EMPLOYER_RATE_55_AND_BELOW;
			totalContribution = employeeContribution+employerContribution;
			System.out.println("The employee's contribution is: $"+frm.format(employeeContribution)+
					"\nThe employee's contribution is: $"+frm.format(employerContribution)+
					"\nThe total contribution is: $"+frm.format(totalContribution));
		} else if (age <= 60) {
			employeeContribution = salary*EMPLOYEE_RATE_55_TO_60;
			employerContribution = salary*EMPLOYER_RATE_55_TO_60;
			totalContribution = employeeContribution+employerContribution;
			System.out.println("The employee's contribution is: $"+frm.format(employeeContribution)+
					"\nThe employee's contribution is: $"+frm.format(employerContribution)+
					"\nThe total contribution is: $"+frm.format(totalContribution));
		} else if (age <= 65) {
			employeeContribution = salary*EMPLOYEE_RATE_60_TO_65;
			employerContribution = salary*EMPLOYER_RATE_60_TO_65;
			totalContribution = employeeContribution+employerContribution;
			System.out.println("The employee's contribution is: $"+frm.format(employeeContribution)+
					"\nThe employee's contribution is: $"+frm.format(employerContribution)+
					"\nThe total contribution is: $"+frm.format(totalContribution));
		} else {
			employeeContribution = salary*EMPLOYEE_RATE_65_ABOVE;
			employerContribution = salary*EMPLOYER_RATE_65_ABOVE;
			totalContribution = employeeContribution+employerContribution;
			System.out.println("The employee's contribution is: $"+frm.format(employeeContribution)+
					"\nThe employee's contribution is: $"+frm.format(employerContribution)+
					"\nThe total contribution is: $"+frm.format(totalContribution));
		}
		

	}

}
