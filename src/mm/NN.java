package mm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NN {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int korean = 0, english = 0, math = 0, total = 0;
		char scores = 0;
		float average = 0.0f;
		do {
			System.out.print("koraen = ");
			korean = Integer.parseInt(in.readLine());
		} while (korean < 0 || korean > 100);

		do {
			System.out.print("english = ");
			english = Integer.parseInt(in.readLine());
		} while (english < 0 || english > 100);

		do {
			System.out.print("math = ");
			math = Integer.parseInt(in.readLine());
		} while (math < 0 || math > 100);

		total = korean + english + math;
		average = total / 3;
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
		
		System.out.println("\ntotal = "+total);
		System.out.println("average = "+average);
		System.out.println("score = "+scores+" point");
		
	}
}
