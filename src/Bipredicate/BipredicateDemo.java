package Bipredicate;

import java.util.function.BiPredicate;

public class BipredicateDemo {
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bipredicate=	(i,j) -> i+j >= 100;
		System.out.println(bipredicate.test(10, 20));
		}

}
