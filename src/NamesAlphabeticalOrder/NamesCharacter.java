package NamesAlphabeticalOrder;

import java.util.function.Predicate;

public class NamesCharacter {
	public static void main(String[] args) {

	String names[]= {"Pooja", "Alia" ,"Kiara", "Krati" , "Pooja", "Paul"};
	
	                   
          Predicate<String> p=(name) -> name.startsWith("K"); 
		
          for(String name:names) {
          boolean test = p.test(name);
             if(test) {
            	System.out.println(name); 
             }
          }
	
	
		
	}


}
