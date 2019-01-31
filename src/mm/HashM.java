package mm;

import java.util.*;

public class HashM {
	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Mohammed", "Essa");
		hm.put("Ali", "Hussein");
		hm.put("Hayder", "Usama");
		hm.put("Ali", "Husein");
		System.out.println(hm);
		
		for(String s:hm.keySet()) {
			System.out.println(s+"  "+hm.get(s));
		}
		
		
		/*Set<String> keys=hm.keySet();
		Iterator<String> listIterator2=keys.iterator();
		
		while(listIterator2.hasNext()) {
			String s=listIterator2.next();
			System.out.println(s+"  "+hm.get(s));
		}*/
		/*hm.put("Omer", "Yusuf");
		hm.put("Muhsin", "Mustafa");
		System.out.println(hm);

		System.out.println(hm.get("Omer"));
		hm.remove("Muhsin");
		System.out.println(hm);
*/
	}
}
