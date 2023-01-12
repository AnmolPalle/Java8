package Persons;

import java.util.ArrayList;
import java.util.stream.Stream;

public class PersonFilter {
	public static void main(String[] args) {

		Person p = new Person("Anmol", 27, "DataScience Engineer");
		Person p1 = new Person("Swapnil", 30, "Associate project engg");
		Person p2 = new Person("Shubham Rangdale", 25, "Serinor software engg");
		Person p3 = new Person("Shubham Latkar", 21, "System engg");
		Person p4 = new Person("Shubham kamde", 68, "Self Employee");

		ArrayList al = new ArrayList();
		al.add(p);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);

		System.out.println(al);
		
//		Stream<Person> stream = al.stream();
//		       Stream<Person> filter = stream.filter((person) -> person.getAge()>=25);
//		 //   filter.forEach((person)->System.out.println(person));
//		filter.forEach(System.out::println);
//		

	Stream<Person> stream = al.stream();
		       Stream<Person> filter = stream.filter((person) -> person.getAge()>=25 && person.getAge()<=50);
		   filter.forEach((person)->System.out.println(person));
		filter.forEach(System.out::println);
		
		
//		Stream<Person> stream = al.stream();
//	       Stream<Person> filter = stream.filter((person) -> person.getAge()>=25 || person.getAge()<=50);
//   filter.forEach((person)->System.out.println(person));
//	//filter.forEach(System.out::println);
//	
	
		
		
		
		
	}

}
