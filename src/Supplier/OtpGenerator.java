package Supplier;

import java.util.function.Supplier;

public class OtpGenerator {

	public static void main(String[] args) {

		Supplier<Double> s = () -> {

			double random = Math.random();
			return random;

		};

		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}


