
public class Employee {
	private String dept;
	
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void header() {
		for(int i =0;i<=40;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
