package day9.함수;

public class 실습문제9_Score {

	public static void main(String[] args) {
		 /*
		 학생이름: 홍길동
	     국어 :90
	     영어 :80
	     평균: 85
	     */
		
		실습문제9_클래스문제3_Score Q3 = new 실습문제9_클래스문제3_Score();
		
		Q3.name="홍길동";
		Q3.kor=90;
		Q3.eng=80;
		Q3.avg=(Q3.eng+Q3.kor)/2;
		
		System.out.println("이름: "+Q3.name);
		System.out.println("국어: "+Q3.kor);
		System.out.println("영어: "+Q3.eng);
		System.out.println("평균: "+Q3.avg);
		
	}

}
