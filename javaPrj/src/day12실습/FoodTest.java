package day12실습;

//0. 상속관계에서 다형성 예제 반드시 만들기 !!!
public class FoodTest {
	public static void main(String[] args) {

		Food F = new Food();
		Lunch1 L = new Lunch1();
		Lunch2 LL = new Lunch2();
		
		F.Lunch();
		L.Lunch();
		LL.Lunch();
	}

}
