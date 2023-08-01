package day11.실습;

public class Ex01 {

	public static void main(String[] args) {

		Lion L = new Lion();
		L.사냥한다();
		
		Jaguar J = new Jaguar();
		J.달린다();
		
		
		WildAnimal wa  =  L; // 업캐스팅  오케이
		// Lion 휴식한다는 기능이 보이지 않느다.. 이게 이해가 되는가?
		// 부모형으로 해석의 범위 축소됩니다.
		Lion L2 = (Lion)wa;  //다운캐스팅 , 명시적형변환
		
		L2.휴식한다(); 
		print(L);
		
	}

	public static void print(WildAnimal LL) {
		LL.운다();
	}
	
}
