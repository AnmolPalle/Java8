package MapOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesMapping {
	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("Anmol");
		list.add("Mohan");
		list.add("Anusha");
		list.add("Pooja");
		list.add("Artee");
		System.out.println(list);

		Stream<String> stream = list.stream();
		Stream<String> map = stream.map(name -> name.toUpperCase());

		map.forEach(name -> System.out.println(name));

	}

}
