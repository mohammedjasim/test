package mm;
import javax.swing.JOptionPane;
public class arry1 {
	public static void main(String[] args) {	
		int a[] = new int[10];
				for (int i = 0; i < a.length; i++)  {
				a[i]=i+11;
				
				}
		/*a[0]= 11;
		a[1]= 12;
		a[2]= 13;
		a[3]= 14;*/
		for (int aa:a) {
		System.out.print(aa+"  ");
		}
		System.out.println();
		insert(a, 2, 00);
		/* int y ;
		 for(int i =a.length-1;i>0;--i) {
			 a[i] = a[i-1];
			 if (i==2) {
				 a[i]=15;
				 break;
			 }
		 }*/
		for (int aa:a) {
			System.out.print(aa+"  ");
		}
	}
	
	public static  void insert (int a[] , int idx , int val) {
		for (int i = a.length-1;i> idx; i--) {
			a[i] =a[i-1];
		}
		a[idx]=val;
	}
}
