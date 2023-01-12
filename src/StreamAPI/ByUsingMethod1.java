package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ByUsingMethod1 {
	public static void main(String[] args) {
		 List<String> list = new ArrayList<>();
			list.add("Mohan");
			list.add("Anmol");
			list.add("Pooja");
			list.add("Akshaylal");
			list.add("Amisha");
			System.out.println(list);

		 Stream<String> stream = list.stream();

		// stream.forEach((n)-> System.out.println(n));
		 stream.forEach(System.out::println);
	}
	}


