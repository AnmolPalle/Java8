package GreaterValueWithoutlamda;

public class Test {
	public static void main(String[] args) {
		PredicateDemo pd = new PredicateDemo();
		boolean nogreterOrNot = pd.NogreterOrNot(77);

		if (nogreterOrNot) {
			System.out.println("greter No");
		} else {
			System.out.println("not greater No");
		}

	}

}
