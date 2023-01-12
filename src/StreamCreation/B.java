package StreamCreation;

import java.util.stream.Stream;

public class B {
	public static void main(String[] args) {
		
		
	Stream<Integer> of = Stream.of(10,20,30,49,88);
	
	of.forEach((i)->System.out.println(i));
	//of.forEach(System.out::println);
}

}
