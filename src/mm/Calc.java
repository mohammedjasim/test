package mm;

import java.util.Scanner;

public class Calc {
	private static Scanner in;
	private static Scanner in1;
	private static Scanner in2;
	private static Scanner in3;
	private static Scanner in4;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		oprations(oprationSelect());
	}

	private static int oprationSelect() {
		in = new Scanner(System.in);
		System.out.print("1:Add 2:Sub 3:Mult 4:Div");
		int unm = in.nextInt();
		return unm;

	}

	private static void oprations(int unm) {
		switch (unm) {

		case 1:
			addValue();
			break;

		case 2:
			addSub();
			break;

		case 3:
			addMult();
			break;

		case 4:
			addDiv();
			break;
		default:
			break;
		}

	}

	private static void addValue() {
		in = new Scanner(System.in);
		System.out.print("Enter the First number :");
		double d1 = in.nextDouble();
		System.out.print("Enter the Second number :");
		double d2 = in.nextDouble();
		double result = d1 + d2;
		System.out.print(result);
	}

	private static void addSub() {
		in1 = new Scanner(System.in);
		System.out.print("Enter the First number :");
		double d1 = in1.nextDouble();
		System.out.print("Enter the Second number :");
		double d2 = in1.nextDouble();
		double result = d1 - d2;
		System.out.print(result);

	}

	private static void addMult() {
		in2 = new Scanner(System.in);
		System.out.print("Enter the First number :");
		double d1 = in2.nextDouble();
		System.out.print("Enter the Second number :");
		double d2 = in2.nextDouble();
		double result = d1*d2;
		System.out.print(result);
	}

	private static void addDiv() {
		in3 = new Scanner(System.in);
		System.out.print("Enter the First number :");
		double d1 = in3.nextDouble();
		System.out.print("Enter the Second number :");
		double d2 = in3.nextDouble();
		double result = d1/d2;
		System.out.print(result);
	}
}