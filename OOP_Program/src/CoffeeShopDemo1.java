import javax.swing.*;

public class CoffeeShopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barista staff1 = new Barista("Leon",'M');
		Barista staff2 = new Barista("Claire",'F');
		
		int typeOfbeverage = Integer.parseInt(JOptionPane.showInputDialog("Input Number of Beverage 1.Hot 2.Cold :"));
		int typeOfcoffee = Integer.parseInt(JOptionPane.showInputDialog("Input Number of Coffee 1.Americano 2.Espresso 3.Cappuccino :"));
		char sizeOfcoffee = JOptionPane.showInputDialog("Input Number of Size S=Short T=Tall G=Grande V=Venti :").charAt(0);
		int BaristaChoose = Integer.parseInt(JOptionPane.showInputDialog("Input Number of Barista 1.Leon 2.Claire :"));
			if(BaristaChoose!=1&&BaristaChoose!=2) BaristaChoose=1;
		Coffee order = new Coffee(typeOfbeverage, sizeOfcoffee,typeOfcoffee,new Barista());
	}

}
