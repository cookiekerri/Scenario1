package security;

public class SecurityUI {
	public static int counter = 0;
	

	public static String minus1() {
		counter = counter - 1;

		return "" + counter;
	}
	
	public static String add1() {
		counter = counter + 1;

		return "" + counter;
	}
}
