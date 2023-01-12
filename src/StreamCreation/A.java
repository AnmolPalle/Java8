package StreamCreation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class A {

	public static void main(String[] args) {
		
		 List<String> list = new ArrayList<>();
			list.add("Anmol");
			list.add("PoojaHegde");
			list.add("Surya");
			list.add("RolexSir");
			list.add("Anand");
			System.out.println(list);

		 Stream<String> stream = list.stream();

		// stream.forEach((n)-> System.out.println(n));
		 stream.forEach(System.out::println);
	}

}
