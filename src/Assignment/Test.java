package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("Anmol");
		p1.setAge(25);

		Person p2 = new Person();
		p2.setName("Mohan");
		p2.setAge(18);

		Person p3 = new Person();
		p3.setName("Anvit");
		p3.setAge(1);

		Person p4 = new Person();
		p4.setName("Advik");
		p4.setAge(1);

		List<Person> l = new ArrayList();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);

		Predicate<Person> predicate = (p) -> p.getAge() >= 18;
		
		for(Person person:l) {
		boolean test = predicate.test(person);
		if(test) {
			System.out.println(person);
		}
		}
	
	}

}
