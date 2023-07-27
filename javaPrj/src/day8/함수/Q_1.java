package day8.함수;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		//두 수의 합을 구하는 함수 만들기
	Scanner add = new Scanner(System.in);
	 int num1;
	 int num2;
	 int sum;
	 
	 System.out.println("첫번째 수를 입력하시오.");
	 num1=add.nextInt();
	 System.out.println("두번째 수를 입력하시오.");
	 num2=add.nextInt();
	 
	 sum=num1+num2;
	 
	 System.out.println("합:"+sum);
		
	}

}
