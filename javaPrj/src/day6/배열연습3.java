package day6;

import java.util.Scanner;

public class 배열연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열은 10개로 준비한다
		//수를 10개 입력받아서 짝수인경우에만 배열에 저장하시오
		//짝수배열의 내용만큼만 모두 출력하시오.
		
		//int[] num = {1,2,4,6,7,9,3,5,11,8};
		
		
		int[] total=new int[10];
		int a=0;
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("음수가 아닌 수를 입력하시오.");
			int num=sc.nextInt();
			
			if(num%2==0) {
				total[a]=num;
				a++;
			}
		}
		for(int i=0;i<a;i++) {
			System.out.print(total[i]+" ");
		}
	}

}
