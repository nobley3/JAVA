package day12실습;
//2. 상속관계 is a  클래스를 두 개 만들고  실행해 보는 예제 만들기 ( 2인 1조 완성하기 )

public class Music {
	String title;
	String singer;
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	public String toString() {
		return title+"\t"+singer;
	}

}
