package mm;
import java.util.Scanner;
public class test4
   {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int grades[][] = new int[x][y];
		String subjects[][] = new String[x][y];
		float average = 0.0f;
		int total = 0;
		char scores = 0;
		for (int i = 0; i < grades.length; i++) {
			for(int j = 0; j <= i;j++) {
			System.out.printf("Enter Subject" + (i + 1) + " Name : ", "Enter Degry" + ( j + 1));
			//subjects[i][j] = x;

			do {
				System.out.print("Enter Grade of  " + subjects[i]+" : ");
				grades[i][j] = in.nextInt();
			} while (grades[i][j] < 0 || grades[i][j] > 100);

			total +=grades[i][j];
		}
		//average = total / x;
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
   }

