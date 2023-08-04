package day13StringEx;

public class Ex03 {

	public static void main(String[] args) {

//		원본(String)의 내용까지 바꿈 hello -> hallo
//		문자열 변경해야 하는 경우
		StringBuilder s = new StringBuilder("hello");
		
		s.setCharAt(1, 'a');
		System.out.println(s);
		
		s.append("I like java");
		System.out.println(s);
		
		
	}

}
