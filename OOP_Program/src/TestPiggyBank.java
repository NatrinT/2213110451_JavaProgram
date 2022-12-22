import java.util.*;

public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();

	public static void main(String[] args) {
		/*
		 * PiggyBank pb = new PiggyBank(); pb.setPiggyBank(500);
		 * System.out.println("Money Total : "+ pb.getTotal()); pb.addTwo (34);
		 * System.out.println("Add 2 Baht Money : "+ 34);
		 * System.out.println("Money Total : "+ pb.getTotal()); pb.addTen (13);
		 * System.out.println("Add 10 Baht Money : "+ 13);
		 * System.out.println("Money Total : " + pb.getTotal()); pb.addFive(100);
		 */

		sizeOfPiggy();
	}

	public static void ln() {
		System.out.println("==========================");
	}

	public static void sizeOfPiggy() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank: " + pb.getPiggyBank());
		inputCoin();
	}

	public static void inputCoin() {
		while (true) {
			ln();
			System.out.println("Menu of PiggyBank");
			ln();
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit.");
			ln();
			System.out.print("Please select choice: ");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.print("Insert 1 baht : ");
				pb.addOne(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 2) {
				System.out.print("Insert 2 baht : ");
				pb.addTwo(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 3) {
				System.out.print("Insert 5 baht : ");
				pb.addFive(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 4) {
				System.out.print("Insert 10 baht : ");
				pb.addTen(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 5) {
				System.out.print("Bye Bye");
				break;
			}
		}
	}
}