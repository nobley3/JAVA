package day13실기평가;

import java.util.Scanner;

public class 문제1 {
//원하는 단을 입력 받아 구구단을 출력하는 프로그램을 작성
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 실행할 수를 입력하시오");
		int num = sc.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}

}
