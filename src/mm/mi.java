package mm;

public class mi {
	public static int factorial(int n) {
		int result = 1;

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			result *= i;
		}
		return result;
	}
	
	
}