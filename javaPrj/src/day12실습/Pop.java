package day12실습;
//2. 상속관계 is a  클래스를 두 개 만들고  실행해 보는 예제 만들기 ( 2인 1조 완성하기 )
public class Pop extends Music{

	public Pop(String title, String singer) {
		super(title, singer);
		
	}

	public String toString() {
		return "타이틀:"+title+"가수:"+singer;
	}
}

// title : A change of Heat
// singer : The 1975

//title : Let her go
//singer : Passenger

//title : Hurricane
//singer : Cannons

