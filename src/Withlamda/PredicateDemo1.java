package Withlamda;

import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {

		Predicate<String> p = (name) -> name.length() >= 7;
		boolean test = p.test("AnmolPalle");
		System.out.println(test);
	}

}
