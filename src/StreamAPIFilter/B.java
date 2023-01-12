package StreamAPIFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class B {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Malti");
		list.add("Pooja");
		list.add("Murali");
		list.add("Deepika");
		list.add("Mutaiah");
		System.out.println(list);

		Stream<String> stream = list.stream();

//		Stream<String> filter = stream.filter((name) -> name.startsWith("M"));
//
//		filter.forEach((name) -> System.out.println(name));
		
		
		Stream<String> filter = stream.filter((name) -> name.startsWith("M"));

		filter.forEach(System.out::println);
		
		
		
		
		

	}

}
