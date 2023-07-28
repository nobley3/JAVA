package day9.함수;

public class 참조형변수 { //변수이기에 크기가 있음

	public static void main(String[] args) {
		
		int[] arr = new int[3]; //new : 메모리를 확보하고 주소를 줌
								//arr : 참조형변수(주소값을 저장하는 변수)
		
		//자바는 배열부터 new 연산자(메모리확보요청),반환값은 확보된 메모리의 위치값정보
		//참조형변수의 기본값 : null (null:나는 아직 아무것도 참조하고 있지 않아요)
		
		int a; //a:기본형 변수
		int b; //b:기본형 변수
		int[] c=new int[3]; //c:참조형변수
		int[][] d=new int[3][2]; //d:참조형변수
		String s; //s: 참조형변수
	}
	
	
	

}
