package day11.변수종류;

//학생 한명이 가져야 할 정보를 표현하기 위한 자료형
public class Student {
	
//변수정보
	String name;
	int kor;
	int eng;
	double avg;
	String teacher;
	
//	기본생성자
	public Student() {
		
	}
	
//	매개변수가 있는 생성자
	public Student(String name, int kor, int eng,String teacher) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (kor+eng)/2.0;
		this.teacher = teacher;
	}
	
	public String toString() {
		return name+" "+kor+" "+eng+" "+avg+" "+teacher;
	}

	
}
