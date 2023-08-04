package day13실기평가;

import java.util.Scanner;

public class MyCalculatorTest {

	public static void main(String[] args) {

		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("곱할 두 수를 입력하시오");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(MyCalculator.ddouble(num1, num2));
		
	}

}
