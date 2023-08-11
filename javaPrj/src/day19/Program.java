package day19;

public class Program {

//	기능을 제공할 코드를 작성하고 싶어서 클래스를 작성하는 경우
//	1. static 사용
//	2. static 사용 안해도 됨
	public void 메서드() {
		System.out.println("hello java!");
		
	}
	public static void main(String[] args) {
		
		Program p = new Program();
		p.메서드();
	}
}
