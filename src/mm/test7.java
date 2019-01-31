package mm;

public class test7 {
	public static void main(String[] args) {
		int[] a = new int [2];
		int i,j,k = 0 ;
		
		for (i = 0 ; i< 2 ; ++i) {
			for ( j = 0 ; j < 3 ; j += 2) {
				k = k + 1;
				a[i] += k;
				
			}
		}
		for (i =0 ; i< 2 ; i++)
			System.out.printf("%d\n " , a[i]);
			
	}

}
