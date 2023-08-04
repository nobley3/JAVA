package day13실기평가;

import java.util.Scanner;

//문제2 수를 입력받으면 1~부터 수까지의 합을 구하는 매서드를 작성하고 매서드를 실행하는 프로그램을 작성하시오
public class MyClass {

	public static void main(String[] args) {

		int getTotal;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오");
		getTotal = sc.nextInt();
		
		for(int i=1;i<=getTotal;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		
		
	}

}
