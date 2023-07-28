package day9.함수;

public class 함수의리턴 {

	public static void main(String[] args) {//시작
		
		int[] arr = new int[]{9,8,7};
		printArr(arr); //호출자리/  호출되면 코드를 수행하고 호출한 쪽으로 돌아옴
		
	}//종료
	
	public static void printArr(int[]a) { //함수의 시작
		
		for(int number:a) {
			System.out.print(number);
		}
		/*==
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		*/
	}//함수의 종료
}
