package day15.정렬연습2;

public class YYTest {

	public static void main(String[] args) {

		Score[] arr =new Score[3];
		
		arr[0]= new Score("서예진",100,90);
		arr[1]= new Score("이윤",90,100);
		arr[2]= new Score("홍길동",80,75);
		
		MyArraysYY2.sort(arr, new A());
		
		for(Score score:arr)
			System.out.println(score);
		
	}

}
