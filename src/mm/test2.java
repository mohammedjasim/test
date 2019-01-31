package mm;

public class  test2 {

	public static boolean aaa() {
		System.out.println("AAA");
		return false;
		
		
	}
	public static boolean bbb() {
		System.out.println("BBB");
		return false;
		
		
	}
	public static void main (String []args) {
		boolean bool =5 < 3 && 7 > 4 ;
		boolean bool1 = 18 !=11 || 7 <=3;
		System.out.println("bool = " + bool);
		System.out.println("bool1 = " + bool1);
		boolean bool3 = aaa() & bbb();
		System.out.println("bool3 = " + bool3);
	}
}
