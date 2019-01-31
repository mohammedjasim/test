package mm;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int grades[] = new int[x];
		String subjects[] = new String[x];
		float average = 0.0f;
		int total = 0;
		char scores = 0;
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Enter Subject" + (i + 1) + " Name : ");
			subjects[i] = in.next();

			do {
				System.out.print("Enter Grade of  " + subjects[i]+" : ");
				grades[i] = in.nextInt();
			} while (grades[i] < 0 || grades[i] > 100);

			total +=grades[i];
		}
		average = total / x;
		switch ((int) average / 10) {
		case 10:
		case 9:
			scores = 'A';
			break;
		case 8:
			scores = 'B';
			break;
		case 7:
			scores = 'C';
			break;
		case 6:
			scores = 'D';
			break;
		case 5:
			scores = 'E';
			break;
		default:
			scores = 'F';
			break;
		}

		System.out.println("\ntotal = " + total);
		System.out.println("average = " + average);
		System.out.println("score = " + scores + " point");

	}

}
