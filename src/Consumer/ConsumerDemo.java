package Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> consumer1 = (name) -> System.out.println(name + ", Where You have been");
		consumer1.accept("Anmol");

		Consumer<Integer> consumer2 = (i) -> System.out.println(i * i);
		consumer2.accept(20);
	}

}
