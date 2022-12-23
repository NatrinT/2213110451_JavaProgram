import java.text.DecimalFormat;
import java.util.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("#,###.00");
		Scanner sc = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int number = sc.nextInt();
		System.out.println();
		Product[] productList = new Product[number];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id   : ");
			productList[i].setId(sc.next());
			System.out.print("Input product Unit : ");
			productList[i].setUnit(sc.nextInt());
			while (productList[i].getUnit() <= 0) {
				System.out.print("Input product Unit, again : ");
				productList[i].setUnit(sc.nextInt());
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------------");
		for (Product unit : productList) {
			if (unit.check(unit.getUnit()).equalsIgnoreCase("low"))
				System.out.println(">> " + unit.getId() + " has " + unit.getUnit() + " units");
		}

		System.out.println("--------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------------");
		for (Product unit : productList) {
			if (unit.check(unit.getUnit()).equalsIgnoreCase("normal"))
				System.out.println(">> " + unit.getId() + " has " + unit.getUnit() + " units");
		}

		System.out.println("--------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("--------------------------------------");
		for (Product unit : productList) {
			if (unit.check(unit.getUnit()).equalsIgnoreCase("high")) {
				System.out.println(">> " + unit.getId() + " has " + unit.getUnit() + " units");
			}
		}
	}

}
