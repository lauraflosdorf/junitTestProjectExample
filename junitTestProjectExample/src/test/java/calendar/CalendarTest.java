package calendar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

class CalendarTest {
	

	@ParameterizedTest
	@ValueSource(ints = {1904, 1923, 1955, 1998, 1972})
	public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
		Calendar calendar = new Calendar(year);
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		boolean expectedResult = gregorianCalendar.isLeapYear(year);;
		boolean actualResult = calendar.isLeapYear();
		
		assertEquals (expectedResult, actualResult);
	}

	//Equivalence Classes Tests:
	
	// 1. Year is > 1900 and <=2000

	// 1.1 Year is not divisible by 4 (year % 4 == 0) --> expected: not a leap year)
	@Test
	public void Should_check_if_year_is_not_leap_if_not_divisible_by_4_and_in_20th_century() {
		Calendar calendar = new Calendar(1989);
		
		//expected Output is not leap year --> assertFalse
		assertFalse (calendar.isLeapYear());
	}
	
	
	// 1.2 Year is divisible by 4, but not by 100 (year % 4 == 0 && year % 100 != 0) --> expected: leap year
	@Test
	public void Should_check_if_year_is_leap_if_divisible_by_4_but_not_by_100_and_in_20th_century() {
		Calendar calendar = new Calendar(1904);
		
		//expected Output is leap year --> assertTrue
		assertTrue (calendar.isLeapYear());
	}
	
	
	// 1.3 Year is divisible by 4 and 400 (year % 4 == 0 && year % 400 == 0) --> expected: leap year 
	@Test
	public void Should_check_if_year_is_leap_if_divisible_by_4_and_400_and_in_20th_century() {
		Calendar calendar = new Calendar(2000); //hier ist nur 2000 als Wert moeglich
		
		//expected Output is leap year --> assertTrue
		assertTrue (calendar.isLeapYear());
	}
	
	
	// 2. Year is <= 1900 --> expected: false (unaccebtable value)
	@ParameterizedTest
	@ValueSource(ints = {1900, 1855})
	public void Should_check_if_return_false_if_year_is_not_in_20th_century_and_is_not_a_leap_year(int year) {
		Calendar calendar = new Calendar(year);
		
		//expected Output is not leap year --> assertFalse
		assertFalse (calendar.isLeapYear());
	}
	
	// 3. Year is > 2000 --> expected: false (unaccebtable value)
		@Test
	public void Should_check_if_return_false_if_year_is_not_in_20th_century_but_is_a_leap_year() {
			Calendar calendar = new Calendar(2055);
			
			//expected Output is not leap year --> assertFalse
			assertFalse (calendar.isLeapYear());
	}
}
