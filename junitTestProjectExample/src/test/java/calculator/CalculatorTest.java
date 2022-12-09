package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int expectedResult = 2 + 3;
		int actualResult = calculator.add(2, 3);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_subtract_two_numbers_and_return_result() {
		int expectedResult = 3 - 2;
		int actualResult = calculator.sub(3, 2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int expectedResult = 3 * 2;
		int actualResult = calculator.multiply(3, 2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		float expectedResult = 6 / 2;
		float actualResult = calculator.divide(6, 2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		
		Exception exception = assertThrows(ArithmeticException.class, () -> {
			calculator.divide(6, 0);
		});
		
		String expectedMessage = "ZeroDivisionError";
		String actualMessage = exception.getMessage();
		
		assertEquals(expectedMessage, actualMessage);
		//assertTrue(actualMessage.contains(expectedMessage)); auch moeglich
	}

}
