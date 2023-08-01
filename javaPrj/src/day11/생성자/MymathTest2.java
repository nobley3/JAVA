package day11.생성자;

public class MymathTest2 {

	public static void main(String[] args) {
//		static 매서드방법 => new필요없음 / 클래스명.매서드명()
		double result=Mymath2.add(2.5, 3.5);
		int result2 = Mymath.addInt(5, 3);
		
		
		System.out.println(result);
		System.out.println(result2);
	}

}
