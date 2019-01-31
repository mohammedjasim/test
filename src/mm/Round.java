package mm;

public class Round {
	int a;
	double b;

	Round() {
		a = 100;
		b = 200.0;
	}

	Round(double y) {
		a = 100;
		b = y;

	}

	Round(int y) {
		a = y;
		b = 200.0;
	}

	Round(int y, double x) {
		a = y;
		b = x;
	}

	public static void main(String[] args) {
		/*
		 * Round kor = new Round(); Round kor1 = new Round(55); Round kor2 = new
		 * Round(78.923); Round kor3 = new Round(123, 45.678); Round kor4 = new
		 * Round(0,0);
		 * 
		 * System.out.println(kor.a + " , " + kor.b); System.out.println(kor1.a + " , "
		 * + kor1.b); System.out.println(kor2.a + " , " + kor2.b);
		 * System.out.println(kor3.a + " , " + kor3.b); System.out.println(kor4.a +
		 * " , " + kor4.b);
		 */
		
		m23 m=new m23(105,5454);
		m.display();

	}
}
