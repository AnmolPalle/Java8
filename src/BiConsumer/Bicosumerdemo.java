package BiConsumer;

import java.util.function.BiConsumer;

public class Bicosumerdemo {
	public class BiConsumerDemo {

		public static void main(String[] args) {

			BiConsumer<String, String> bic = (arg1, arg2) -> {
				System.out.println("Hi, do you have pen:- " + arg1);
				System.out.println("Yes:-" + arg2);
			};

			bic.accept("Anmol", "Pooja");
		}
	}

}
