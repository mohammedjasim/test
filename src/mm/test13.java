package mm;
// Q13// MOHAMMED JASIM
import java.util.Scanner;
public class test13 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System .in);
		boolean flag = false;
		int sum = 0 ,k ,h;
		System.out.print("Enter First number=");
		k = in.nextInt();
		// k is first number
		
		System.out.print("Enter Last number=");
		h = in.nextInt();
		// h is Last number
		for (int i = k; i <= h; ++i) {
			flag = false;
			for (int j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = true;
					break;

				}
			}

			if (!flag) {
				sum += i;

				System.out.println(i);

			}
		}
		System.out.println("The Sum of the prime number = " + sum);
	}

}