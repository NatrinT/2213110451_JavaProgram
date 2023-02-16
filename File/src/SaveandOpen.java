import java.io.*;
import java.util.Scanner;

public class SaveandOpen extends Employee {
	private String name;
	private String dept;

	public void insert() throws IOException {
		Scanner scn = new Scanner(System.in);
		PrintStream write = new PrintStream(new File("employee.txt"));
		String again;
		do {
			super.header();
			System.out.print("Enter name        : ");
			String name = scn.next();
			System.out.print("Enter department  : ");
			String depart = scn.next();
			System.out.print("Enter data again? : ");
			again = scn.next();
			write.println(name+"\t"+depart);
		} while (again.equalsIgnoreCase("y"));
		write.close();
	}

	public void read() {
		try {
			Scanner scn = new Scanner(new File("employee.txt"));
			int i=0;
			boolean check =false;
			super.header();
			while(scn.hasNext()) {
				name=scn.next();
				dept=scn.next();
				if(dept.equalsIgnoreCase(super.getDept()))){
					i++;
					System.out.println(i+") "+name);
					check=true;
				}
			}
			if(check) {
				super.header();
				System.out.print("\nEmployee in department "+super.getDept()+" is "+i+" person.");
				super.header();
			}
			else {
				System.out.println("\nSorry, no department "+super.getDept()+" in file.");
			}
		} catch (IOException e) {
			System.out.println("Sorry , file not found......");
		}
	}
}
