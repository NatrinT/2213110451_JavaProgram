import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("#,###.00");
		Scanner scn = new Scanner(System.in);
		Product[] productList = new Product[4];
		for(int i =0;i<productList.length;i++) {
			productList[i]=new Product();
			do {
			System.out.print("Input product id    : ");
			productList[i].setId(scn.next());
			System.out.print("Input product unit  : ");
			productList[i].setUnit(scn.nextInt());
			System.out.print("Input product price : ");
			productList[i].setPrice(scn.nextDouble());
			System.out.println();
			}while(productList[i].getUnit()<=0||productList[i].getPrice()<=0);
		}
		System.out.println("--------------------------------------------");
		double sum = 0;
		for(Product show : productList) {
			System.out.println("Product ID : "+show.getId()+", Total price = "+f.format(show.calculate())+" baht.");
			sum+=show.calculate();
		}
		System.out.println("--------------------------------------------");
		System.out.println("Total price of all products is "+f.format(sum)+" baht.");
	}

}
