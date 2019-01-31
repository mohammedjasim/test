package mm;


public class tt1 {
	public static void main(String[] args) {
	
   
    int i=8;
    int j=i >>1;
   System.out.println(i);
   System.out.println(j);
    System.out.println(i);
    int x = 100;
    System.out.println("x = " +  x);
    ++x;
    System.out.println("x = " +  x);
    ++x;
    System.out.println("x = " +  x);
    int k = -8;
    System.out.println(k>>>3);
    System.out.println(k>>>3);
    System.out.println(k>>>3);
    System.out.println(k>>>3);
    System.out.println(Integer.toBinaryString(k)) ;
    System.out.println(Integer.toBinaryString(-8)) ;
    System.out.println(Integer.toBinaryString(8)) ;
    System.out.println(Integer.toBinaryString(x)) ;
    System.out.println(Integer.toBinaryString(-x)) ;
    int a=4 ;
    int b=7 ;
    System.out.println("& = " + ( a & b));
    System.out.println("| = " + ( a | b));
    System.out.println("^ = " + ( a ^ b));
    Calc cat  = new Calc();
    boolean bool = cat instanceof Object;
    System.out.println("bool = " +   bool);
    
    
    
    
    
    
	}
}

