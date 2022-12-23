
public class Product {
	private String id;
	private int unit;
	private double price;

	public void setId(String ID) {
		id = ID;
	}

	public String getId() {
		return id;
	}

	public void setUnit(int UNIT) {
		unit = UNIT;
	}

	public int getUnit() {
		return unit;
	}

	public void setPrice(double PRICE) { 
		price = PRICE;
	}

	public double getPrice() {
		return price;
	}

	public double calculate() {
		return price*unit;
	}
	
	public String check(int product) {
		if(product<5) return "low";
		else if (product>=5&&product<=50) return "normal";
		else return "high";
	}
}
