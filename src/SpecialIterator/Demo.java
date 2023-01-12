package SpecialIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList();
		al.add("Anmol");
		al.add("Palle");
		al.add("Lalpeth colony");
		al.add("Chandrapur");
		System.out.println(al);
		 Iterator<String> iterator = al.iterator();
//		 while(iterator.hasNext()) {
//			 String next = iterator.next();
//			 System.out.println(next);
//		 }
		 
	//	 iterator.forEachRemaining((name)->System.out.println(name));
		iterator.forEachRemaining(System.out::println); 
		 
	}
}
