package GreaterValueWithlamda;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
		
	Predicate<Integer> p= (number) -> number > 50;
		        boolean test = p.test(99);
		
		if (test) {
			System.out.println("greter No");
		} else {
			System.out.println("not greater No");
		}

	}

}
/*Predefined Functional interfaces introduced in java-8
-----------------------------------------------------------------------------------------------
-> Several functional interfaces got introduced in java-8, they are

1) Predicate
2) Supplier
3) Consumer
4) Function
-> The above functional interfaces are provided in java.util.function package.

Predicate
=========
-> Predicate is used for checking condition and returns true or false value.

-> Predicate is having test ( ) method which is used to invoke/call lambda expression.

-> Predicate is a predefined functional interface.

-> Predicate is having an abstract method called test().

-> We have below methods in Predicate

	test ( ) ----> It is abstract method
	negate() ---> To reverse condition.
	and() ---> if all predicates statisfield returns true.
	or() ---> if any one predicate satisfied returns true.
 
nagate(),and(),or() these are default methods.

-> If we have a lambda which checks condition and returns true or false then we can invoke 
that lamdba using Predicate functional interface like below

	//Checking given number is even number or not
	Predicate<Integer> predicate = (i) -> i%2 == 0 ;
	boolean isEventNum  = predicate.test(10); */
