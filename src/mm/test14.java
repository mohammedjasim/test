package mm;

//MOHAMMED JASIM
import java.util.Scanner;

public class test14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float i, j, result;

		System.out.print("Enter i=");
		i = in.nextFloat();

		System.out.print("Enter opratin=");
		String type = in.next();

		System.out.print("Enter j=");
		j = in.nextFloat();
		switch (type) {
		case "+":
			result = i + j;
			System.out.println("result i+j= " + result);
			break;
		case "-":
			result = i - j;
			System.out.println("result i-j= " + result);
			break;
		case "/":
			result = i / j;
			System.out.println("result i/j= " + result);
			break;
		case "*":
			result = i * j;
			System.out.println("result i*j= " + result);
			break;
			default:
				System.out.println("Error!");
		// System.out.print("Enter brosece=");

		}
	}
}
