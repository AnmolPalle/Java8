package StreamAPIFilter;

import java.util.stream.Stream;

public class A {
	public static void main(String[] args) {
		
		
	Stream<Integer> of = Stream.of(10,20,30,49,88);
	
//	Stream<Integer> filter = of.filter((i) -> i>=30);
//	filter.forEach((i)->System.out.println(i));
	
	Stream<Integer> filter = of.filter((i) -> i>=30 & 88<=i);
	filter.forEach(System.out::println);
	
}

}
