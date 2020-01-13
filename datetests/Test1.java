package datetests;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test1 {
	public static void main(String args[]) {
		LocalDate date = LocalDate.now();
		LocalDateTime time = LocalDateTime.now();
		
		System.out.println(date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear());
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		
		LocalDate doj =  LocalDate.of(2020, 01, 20);
		System.out.println(doj);
	}

}
