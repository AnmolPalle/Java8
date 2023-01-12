package DateAndTimeAPI;

import java.time.Duration;
import java.time.LocalTime;

public class Demo5 {
	public static void main(String[] args) {
		Duration between = Duration.between(LocalTime.parse("12:14"), LocalTime.parse("13:15"));
		System.out.println(between);
	}

}
