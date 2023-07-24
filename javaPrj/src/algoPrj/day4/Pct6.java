package algoPrj.day4;

import java.util.Scanner;

public class Pct6 {

	public static void main(String[] args) {
		//6. 수를입력받아서 짝수의 합을 구하세요 ( 10개의 수를 입력)
/*
		Scanner sc= new Scanner(System.in);
		System.out.println("10개의 수를 입력하시오.");
		
		int sum=0;
		
		for(int i=0;i<10;i++) {
			int num=sc.nextInt();
			
			if(num%2==1) {
				continue;
			}
			sum=sum+num;
		}
		
		System.out.println(sum);
*/		
		
		//입력 : 임의의 수
		//출력 : 짝수의 합
		//처리 : 반복제어변수 : i
		
		Scanner sc= new Scanner(System.in);
		
		int su;
		int even_sum=0;//초기화
		for(int i=1;i<=10;i++) {
			su=sc.nextInt();
			if(su%2==1) {
				continue;
			}
			even_sum+=su;
		}
		System.out.println(even_sum);
		
		
	}

}
