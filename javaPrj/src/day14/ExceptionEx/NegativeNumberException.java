package day14.ExceptionEx;

public class NegativeNumberException extends Exception {
	
//Exception(필수예외)
	public NegativeNumberException() {
		super( "음수이면 안된다");
	}

}
