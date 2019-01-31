package mm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AA {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("PositiveValue= ");
		int x = Integer.parseInt(in.readLine());
		if (x > 0) {
			System.out.println(" x = " + x);
			System.out.println(" Printed.");
			
		}
		else  System.out.println("Erorr");
	}
	}


