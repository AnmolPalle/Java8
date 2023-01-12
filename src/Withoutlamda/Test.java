package Withoutlamda;

public class Test {
public static void main(String[] args) {
		
		PredicateDemo pd=new PredicateDemo();
		boolean oddorEven = pd.oddorEven(13);
		
		if(oddorEven) {
			System.out.println("Even No");
		}else {
			System.out.println("Odd No");
		}
	}

}
