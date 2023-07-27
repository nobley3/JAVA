package day8.함수;

public class Ex01 {

	public static void main(String[] args) {
		printSum(); //함수호출
	}
				//void : 반환값이 없다.
	 			//반환 type 함수명() //(입력정보(매개변수))
	public static void printSum() {
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
