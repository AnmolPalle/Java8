package Withlamda;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {

		Predicate<Integer> p = (number) -> number % 2 == 0;
		boolean test = p.test(13);

		if (test)
		{
			System.out.println("Even No");
		} else {
			System.out.println("Odd No");
		}
	}

}
