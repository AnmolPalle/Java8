package Withoutlamda;

public class PredicateDemo1 {
	public boolean CountNoChar(String name) {

		if (name.length() >= 7) {
			return true;
		} else {

			return false;
		}
	}

	public static void main(String[] args) {

		PredicateDemo1 nc=new PredicateDemo1();
		boolean countNoChar = nc.CountNoChar("Anmol");
		System.out.println(countNoChar);
	}

}
