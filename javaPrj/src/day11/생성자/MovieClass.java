package day11.생성자;

public class MovieClass {

	String title; //클래스형의 기본값은 null 
	String genre;
	String runningtime;
	String rating;
	
	public void input (String title, String genre, String runningtime, String rating) {
		this.title=title;
		this.genre=genre;
		this.runningtime=runningtime;
		this.rating=rating;
		
	}
	
//	생성자, 매개변수가 있는 생성자
//	생성자 규칙 : 1. 반드시 클래스명과 동일해야함
//			  2. 반환타입을 명시하면 안된다.->오류발생
//			  3. 생성자는 만들지 않음녀기본생성자를 하나 제공함(default 생성자)
//				 default 생성자 : 매개변수가 없는 생성자르 의미함
//	프로그래머가 생성자를 하나라도 만들면 기본생성자가 제공이 안된다.
//	프로그래머가 기본생성자를 만들어야함.
	
	public MovieClass(String title, String genre, String runningtime, String rating) {
		this.title=title;
		this.genre=genre;
		this.runningtime=runningtime;
		this.rating=rating;
	}
	
	public MovieClass() {
		//하는일이 없을뿐 오류가 아님
	}
	
	public void printInfo() {
		System.out.println("제목:"+title);
		System.out.println("장르:"+genre);
		System.out.println("상영시간:"+runningtime);
		System.out.println("관람가:"+rating+"\n");
		
	}
	
}
