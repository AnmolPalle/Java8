package Function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, String> f1 = (s) -> s.toUpperCase();
		System.out.println(f1.apply("anmol :- belongs from india "));

		Function<Integer, Integer> f2 = (i) -> (i * i);
		System.out.println(f2.apply(10));
	}


}
