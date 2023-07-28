package day9.함수;

public class 재사용성 {

	public static void main(String[] args) {
		int su1=9,su2=5;
		int sum = su1+su2;
		System.out.println(sum);
		
		int su3=5, su4=6;
		int result = adder(su3,su4);
		System.out.println(result);
	}
	
	//반환 type(1개) 함수명(입력정보)
	//반환이 없을 때 : void
	//복잡한 데이터를 반환해야 할 때 배열이나, 객체를 사용
/*	   기능: 두수를 더해주는 기능, (함수명 작명: 기능에 맞게 첫글자 소문자로)
	 * 작성자 : 서예진
	 * 입력정보 : 두개의 정수
	 * 반환정보 : 두 수의 합
 */
	public static int adder(int su1,int su2) {
		int sum = su1+su2;
		return sum;
		
	}
}
