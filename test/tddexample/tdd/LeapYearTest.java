package tddexample.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class LeapYearTest {

	LeapYear leapYear;
	boolean isLeapYear;

	@Before
	public void setUp() {
		leapYear = new LeapYear();
	}

	@Test
	public void testValidLeapYear() throws InvalidYearException {
		isLeapYear = leapYear.checkIfLeapYear(1992);
		assertThat(true, equalTo(isLeapYear));
	}

	@Test
	public void testinValidLeapYear() throws InvalidYearException {
		isLeapYear = leapYear.checkIfLeapYear(1993);
		assertThat(false, equalTo(isLeapYear));
	}

	@Test(expected = InvalidYearException.class)
	public void testinValidInput() throws InvalidYearException {
		leapYear.checkIfLeapYear(0);
	}

	@Test(expected = InvalidYearException.class)
	public void testinValidNegativeInput() throws InvalidYearException {
		leapYear.checkIfLeapYear(-1);
	}

	@Test
	public void testisDivisibleby400() throws InvalidNumberException {
		assertTrue(leapYear.isDivisibleby400(800));
	}

	@Test
	public void testisNotDivisibleby400() throws InvalidNumberException {
		assertFalse(leapYear.isDivisibleby400(401));
	}

	@Test(expected = InvalidNumberException.class)
	public void testisInvalidInputDivisibleby400()
			throws InvalidNumberException {
		leapYear.isDivisibleby400(-1);
	}

}
