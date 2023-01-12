package ReverseArray;

import java.util.Comparator;
import java.util.stream.Stream;

public class A {
	public static void main(String[] args) {
		
		Stream<Integer> inputList=Stream.of(1,2,3,4,5,6);
		inputList.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
