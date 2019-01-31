package mm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class mmmmmmm {
	public static void main(String[] args) {

		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
	String k=JOptionPane.showInputDialog("enter text");
	
	System.out.println(k);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list);
		ListIterator<Integer> I= list.listIterator();
		
		hm1.put("Mohammed", 10);
		hm1.put("Ali", 101);
		hm1.put("Hayder", 102);
		System.out.println(hm1);

		hm1.put("Omer", 103);
		hm1.put("Muhsin", 104);
		System.out.println(hm1);

		System.out.println(hm1.get("Omer"));
		hm1.remove("Muhsin");
		System.out.println(hm1);

	}
}


