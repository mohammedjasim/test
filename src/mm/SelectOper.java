package mm;

import java.util.Locale;
import java.util.Scanner;

public class SelectOper {
	public static int operatorSelect() {
		Scanner in2 = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("1:Add, 2:Sub, 3:Mult, 4:Div:");
		int num = in2.nextInt();
		return num;
	}

	public static void operators(int num) {
		switch (num) {
		case 1:
			MathOprator.addValue();
			break;
		case 2:
			MathOprator.addSub();
			break;
		case 3:
			MathOprator.addMult();
			break;
		case 4:
			MathOprator.addDiv();
			break;

		default:
			break;
		}}
}

