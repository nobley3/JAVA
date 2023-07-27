package day8.함수;



public class Q_3 {

	public static void main(String[] args) {
		// 원하는 개수만큼 별을 출력하는 함수 만들기
		
		
		int star=7;
		getStar(star);
		
	}

	public static void getStar(int star) {
		for(int i=0;i<star;i++) {
			System.out.print("*");
		}
	}

}
