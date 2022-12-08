
public class Lab501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(formatNumber(500));
		System.out.println(formatNumber('a'));
		System.out.println(formatNumber(89.9941));
		System.out.println(formatNumber("500"));
	}
	
	private static String formatNumber(int value) {
		return String.format("%d", value);
	}

	private static String formatNumber(double value) {
		return String.format("%.2f", value);
	}
	private static String formatNumber(String value) {
		return String.format("%.2f", Double.parseDouble(value));
	}
}
