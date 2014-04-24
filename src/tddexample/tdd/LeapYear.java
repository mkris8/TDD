package tddexample.tdd;

public class LeapYear {

	private final int FOUR_HUNDRED = 400;
	private final int FOUR = 4;
	private final int HUNDRED = 100;

	/*
	 * if input % 400 == 0) || ((input % 4 == 0) && (input % 100 != 0))) {
	 * return true; } else { return false; }
	 */

	public boolean checkIfLeapYear(long input) throws InvalidYearException {

		if (validateInput(input)) {
			throw new InvalidYearException("Not a valid year !!");
		}

		if (processInput(input)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean validateInput(long input) {
		return input == 0 || input == -1;
	}

	private boolean processInput(long input) throws InvalidYearException {
		return isDivisibleby400(input) || (isDivisibleby4(input) && isNotDivisibleby100(input));
	}

	public boolean isNotDivisibleby100(long input) {
		return input % HUNDRED != 0;
	}

	public boolean isDivisibleby4(long input) {
		return input % FOUR == 0;
	}

	public boolean isDivisibleby400(long input) throws InvalidNumberException {

		if (validateInput(input)) {
			throw new InvalidNumberException(
					"passed a wrong input to the method");
		}
		boolean result;
		result = input % FOUR_HUNDRED == 0;
		return result;
	}

}
