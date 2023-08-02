package day12실습;
//1. 상속관계 is a  클래스를 두 개 만들고  실행해 보는 예제 만들기 ( 혼자 실습 )
public class AnimalInfo extends Animal{

	public AnimalInfo(String kind, String bark) {
		super(kind, bark);
		
	}
	
	public String toString() {
		return "종:"+kind+" "+"울음소리:"+bark;
		
	}

}
