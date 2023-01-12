package JoiningOR;

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
		p3.setName("Pooja");
		p3.setAge(32);

		Person p4 = new Person();
		p4.setName("Shankar");
		p4.setAge(55);

		List<Person> l = new ArrayList();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);

		Predicate<Person> agelowerLimit = (p) -> p.getAge() >= 21;

		Predicate<Person> upperAgeLimit = (p) -> p.getAge() <= 64;

		for (Person person : l) {

			Predicate<Person> and = agelowerLimit.or(upperAgeLimit);
			boolean test = and.test(person);
			if (test) {
				System.out.println(person);
			}
		}

	}

}
