
public abstract class Shape {
	private String color;
	
	public Shape(String color) {
		this.color=color;
	}
	
	public Shape() {
		this.color="";
	}
	
	public abstract double getArea();
	
	public String toString() {
		return " color = "+this.color;
	}
}
