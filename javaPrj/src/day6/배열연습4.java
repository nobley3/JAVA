package day6;

import java.util.Scanner;

public class 배열연습4 {

	public static void main(String[] args) {
		/*
		배열은 10개로 준비한다.
		수를 10개 입력받아서 배열에 모두 저장하시오
		배열의 모든값을 다 더한 결과를 출력하시오
		배열의 모든값을 출력하시오

		단 입력과 출력을 분리합니다)
		*/
		
		//배열생성
		int[] arr = new int[10];
		int sum=0;
		
		
		//입력받기
		Scanner sc=new Scanner(System.in);
		
		//배열저장
		for(int i=0; i<arr.length;i++) {
			System.out.println("음수가 아닌 수를 입력하시오.");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		//출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("총합:"+sum);
		
	}

}
