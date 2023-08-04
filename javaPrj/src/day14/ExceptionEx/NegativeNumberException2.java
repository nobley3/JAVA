package day14.ExceptionEx;

public class NegativeNumberException2 extends RuntimeException {
	
//RuntimeException(선택예외) : 해도되고 안해도 되는 ..
	public NegativeNumberException2() {
		super( "음수이면 안된다");
	}

}
