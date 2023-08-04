package day13성적관리;

//성적데이터를 처리하기 위한 자료형 필요
public class Score {
	
//	멤버변수
private	String name;
private	int kor;
private	int eng;
private	String result;

//	생성자
// 	this : 참조형변수, 자기참조형변수
//	단, static매서드에는 this가 전달되지 않는다.
public Score(String name, int kor, int eng) {
	super();
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	calResult();
	
	}

	public void calResult(Score this) {
		int sum = kor+eng;
		double avg = sum/2.0;
		if(avg>80)result="합격";
		else
			result = "불합격";
	}

	public Score() {
		
	}
//	static매서드는 클래스명.매서드() ex)Math.abs(-5)
	/*
	public static void print() {
		System.out.println("*****");
		System.out.println(name); //멤버변수(인스턴스변수를 사용할 수 없다.)
	}
	*/

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", result=" + result + "]";
	}
	
//	쎄터 : set 첫글자-대문자 규칙
//	게터 : get 첫글자-대문자 규칙
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
