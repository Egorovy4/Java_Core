package lesson20_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Application {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Date before setting: " + date);

		date.setYear(96);
		date.setMonth(9);
		date.setDate(19);
		date.setHours(22);
		date.setMinutes(22);
		date.setSeconds(22);

		System.out.println("Date after setting: " + date);

		LocalDate localDate = localDateConvert(date);
		System.out.println("Local date: " + localDate);

		LocalTime localTime = localTimeConvert(date);
		System.out.println("Local time: " + localTime);

		LocalDateTime localDateTime = localDateTimeConvert(date);
		System.out.println("LocalDateTime: " + localDateTime);
	}

	@SuppressWarnings("deprecation")
	public static LocalDate localDateConvert(Date date) {
		LocalDate localDate = LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
		return localDate;
	}

	@SuppressWarnings("deprecation")
	public static LocalTime localTimeConvert(Date date) {
		LocalTime localTime = LocalTime.of(date.getHours(), date.getMinutes(), date.getSeconds());
		return localTime;
	}

	@SuppressWarnings("deprecation")
	public static LocalDateTime localDateTimeConvert(Date date) {
		LocalDateTime localDateTime = LocalDateTime.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate(),
				date.getHours(), date.getMinutes(), date.getSeconds());
		return localDateTime;
	}
}