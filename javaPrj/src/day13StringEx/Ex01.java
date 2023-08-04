package day13StringEx;

public class Ex01 {

	public static void main(String[] args) {

//		문자열을 생성하는 방법 2가지
		
//	  	===1.===		
//		한 번 생성된다.
//		정적영역(상수영역에서 생성된다.)
//		같은 문자열을 사용할 때는 별도의 공간을 확보하는 것이 아니라 래퍼런스(주소)만 제공받는다.
		String str0 = "Hello";  //"Hello" 한 개만
		String str1 = "Hello";
//		문자열 수정 불가
//		보통 String에서 많이 쓰이는 방법
		
//		===2.===
//		2개가 각 각 생성된다.
//		heap메모리에 각각 생성된다
		String str2 = new String("Hello");
		String str3 = new String("Hello");
//		문자열 수정 불가 ( final char[] value)
	}

}
