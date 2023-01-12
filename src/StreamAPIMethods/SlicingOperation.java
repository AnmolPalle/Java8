package StreamAPIMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SlicingOperation {
	public static void main(String[] args) {
		List<String> countries=new ArrayList();
		countries.add("India");
		countries.add("Russia");
		countries.add("USA");
		countries.add("England");
		countries.add("India");
		countries.add("France");
		countries.add("Russia");
		countries.add("England");
		System.out.println(countries);
		
		Stream<String> stream=countries.stream();
		Stream<String> distinct=stream.distinct();
		
		distinct.forEach((country)->System.out.println(country));
		distinct.forEach(System.out::println);
		
		Stream<String> limit=stream.limit(3);
		limit.forEach((country)->System.out.println(country));
		
		//Stream<String> skip=stream.skip(4);
		//skip.forEach((country)->System.out.println(country));
		
	}

}
