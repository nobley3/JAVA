package day12실습;
//1. 상속관계 is a  클래스를 두 개 만들고  실행해 보는 예제 만들기 ( 혼자 실습 )
public class AnimalTest {

	public static void main(String[] args) {

		
		AnimalInfo AA = new AnimalInfo("호랑이","어흥~!");
		AnimalInfo BB = new AnimalInfo("고양이","야옹~!");
		
		System.out.println(AA.toString());
		System.out.println(BB);
	}

}
