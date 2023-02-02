
public class Coffee extends Drink {
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	public Coffee(int type,char sizeCoffee,int typeCoffee,Barista barista) {
		super(type,sizeCoffee);
		this.sizeCoffee=sizeCoffee;
		this.typeCoffee=typeCoffee;
		this.barista=barista;
	}
	
	public Coffee(int type,int typeCoffee) {
		super(type,' ');
		this.typeCoffee=typeCoffee;
		this.sizeCoffee=' ';
		this.barista=null;
	}
	
	public Barista getBarista() {
		return this.barista;
	}
	
	public String getTypeName() {
		return typeCoffee==1?"Americano":typeCoffee==2?"Espresso":typeCoffee==3?"Cappuccino":null;
	}
	
	public int getTypePrice() {
		return typeCoffee==1?50:typeCoffee==2?55:typeCoffee==3?65:0;
	}
	
	public String getSizeName() {
		return sizeCoffee=='s'?"Short":typeCoffee=='t'?"Tall":typeCoffee=='g'?"Grande":typeCoffee=='v'?"Venti":null;
	}
	
	public int getSizePrice() {
		return sizeCoffee=='s'?100:typeCoffee=='t'?150:typeCoffee=='g'?200:typeCoffee=='v'?250:null;
	}
	
	public int getTotalPrice() {
		return super.getTypePrice()+getTypePrice()+getSizePrice();
	}
	
	public String toString() {
		return super.getTypeName()+" "+this.getTypeName()+" ("+sizeCoffee+") is "+this.getTotalPrice()+" baht.";
	}
}
