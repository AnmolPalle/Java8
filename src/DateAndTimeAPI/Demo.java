package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class Demo {
	public static void main(String[] args) {
		
	// Getting Current Date
	LocalDate now=LocalDate.now();
    System.out.println(now);
    
    
    // Getting specific date using of method
    LocalDate date= LocalDate.of(2020, 12, 20);
    System.out.println(date);
    
    date=LocalDate.of(2021, Month.DECEMBER, 20);
    System.out.println(date);
    
    //Converting String to Date using parse
    date =LocalDate.parse("2025-12-20");
    System.out.println(date);
    
    // Adding 4 days to give date
    date=date.plusDays(5);
    System.out.println(date);
    
    //Adding 5 months to give Months
    date=date.plusMonths(5);
    System.out.println(date);
    
 // Check date is before given date
 		boolean isBefore = LocalDate.parse("2020-03-12").isBefore(LocalDate.parse("2018-06-14"));
 		System.out.println(isBefore);
 		
 		// Check date is after given date
 		boolean isAfter = LocalDate.parse("2020-03-12").isAfter(LocalDate.parse("2018-06-14"));
 		System.out.println(isAfter);

}
}