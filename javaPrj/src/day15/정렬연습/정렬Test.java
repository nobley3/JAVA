package day15.정렬연습;



public class 정렬Test {

	public static void main(String[] args) {
		

		Score[] arr = new Score[3]; // 이 배열은 모두 null로 초기화됨
		
		arr[0]= new Score("홍길동",100,90);
		arr[1]= new Score("김길동",80, 75);
		arr[2]= new Score("다길동",75, 85);
		
		
		MyArraysYY.sort(arr, new A());
		
		
		for(Score score:arr) {
			System.out.println(score);
		}
		

	}

}
