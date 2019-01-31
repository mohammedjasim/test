package mm;

public class test5 {
public static void main(String[] args) {
	int a[] = {40 , 100 , 70 , 80 , 20 };
	int i , min , max ;
	max = a[0];
	min = a[0];
	for  (i =1 ; i< 5 ; i++){
		if  (max < a[i] ) max = a[i];
		if (min> a[i] ) min = a[i] ;
	}
	System.out.println(max);
	System.out.println(min);
	
		
	}
	

}
