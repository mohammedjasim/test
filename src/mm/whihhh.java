package mm;

import java.util.Scanner;

public class whihhh {
	public static void main(String[] args) {
		Scanner in = new Scanner((System.in));
		// System.out.print(" * ");
		int i, k, j;
//System.out.print("Input Value=");

		// = in.nextInt();
		for (i = 0; i <= 10; ++i) {
			
			
			
			for (j = 1; j <= i; j += 1) {
				System.out.print("       ");

			}
			for (k = 10 - i; k >= 0; k--) 
			System.out.print("* ");
	
			System.out.println("     ");

			// System.out.println(" * * * * * * * * * * * * * * * * * * * * *");
		}

	}

}