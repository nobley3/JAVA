package day19;

public class Program3 {
	
public static void main(String[] args) {
		
//	책정보를 담을 수 있는 변수를 만든 것.
//	객체라고 부름 1.( 구조가 있는 변수 )+ 변수를 다루는 매서드
		Book book = new Book("자바의정석",28000,"도우출판사");
		book.메서드(); //book 객채의 정보 전달 됨-> this 참조형변수
	}
}
