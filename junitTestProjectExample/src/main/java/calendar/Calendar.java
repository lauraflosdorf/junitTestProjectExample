package calendar;

public class Calendar {
	
	public int year;
	
	public Calendar(int year) {
		this.year = year;
	}
	
	public boolean isLeapYear() {
		return (this.year > 1900 && this.year <=2000 && this.year % 4 == 0) && (this.year % 100 != 0 || this.year % 400 == 0);
	}
}

/* Equivalence Classes:
 * 1. Year is > 1900 and <=2000 and not divisible by 4 --> not a leap year
 * 2. Year is > 1900 and <=2000 and divisible by 4, but not by 100 --> leap year
 * (Year is > 1900 and <=2000 and divisible by 4, not by 100 and not by 400 --> leap year) 
 * (Year is > 1900 and <=2000 and divisible by 4, not by 100 and by 400 --> leap year)
 * 3. Year is > 1900 and <=2000 and divisible by 4 and 400 --> leap year 
 * 4. Year is > 1900 and <=2000 and divisible by 4, by 100 but not by 400 --> no leap year
 * 5. Year is > 1900 and <=2000 and divisible by 4 and 100, but not by 400 --> no leap year
 * 6. Year is > 1900 and <=2000 and divisible by 4 and 400 --> leap year 
 */

