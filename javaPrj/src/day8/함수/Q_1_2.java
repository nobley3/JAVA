package day8.함수;

import java.util.Scanner;

public class Q_1_2 {

	public static void main(String[] args) {
		//두 수의 합을 구하는 함수 만들기
	 
	 add(3,5);
	 int result  = add2(3,5);
	 
	 System.out.println(  result);
	 
	
		
	}

	public static void add(  int num1, int num2) {	 
		 int sum;		 
		 sum=num1+num2;
		 
		 System.out.println("합:"+sum);
	}
	
	public static int add2(  int num1, int num2) {	 
		 int sum;	 	 
		 
		 sum=num1+num2;
		 
		 return sum;
	}
	
	
	

}
