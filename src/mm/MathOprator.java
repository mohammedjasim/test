package mm;

import java.util.Locale;
import java.util.Scanner;


public class MathOprator {
	private static Scanner in;
	private static Scanner in2;
	private static Scanner in3;
	private static Scanner in4;
	private static Scanner in5;
	
	public static void addDiv() {
		in = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Enter the First No :");
		double d1 = in.nextDouble();
		System.out.println("Enter the Second No :");
		double d2 = in.nextDouble();
		double result = d1 / d2;
		System.out.println(result);				
	}

	public static void addMult() {
		in3 = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Enter the First No :");
		double d1 = in3.nextDouble();
		System.out.println("Enter the Second No :");
		double d2 = in3.nextDouble();
		double result = d1 * d2;
		System.out.println(result);		
	}

	public static void addValue() {
		in5 = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Enter the First No :");
		double d1 = in5.nextDouble();
		System.out.println("Enter the Second No :");
		double d2 = in5.nextDouble();
		double result = d1 + d2;
		System.out.println(result);
	}

	public static void addSub() {
		in4 = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Enter the First No :");
		double d1 = in4.nextDouble();
		System.out.println("Enter the Second No :");
		double d2 = in4.nextDouble();
		double result = d1 - d2;
		System.out.println(result);
	}

}
