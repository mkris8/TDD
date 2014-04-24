package tddexample.tdd;

public class InvalidYearException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidYearException(String message){
		super(message);
	}
}
