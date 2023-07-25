package algoPrj.day5;

import java.util.Scanner;

public class Pct2 {

	public static void main(String[] args) {
		// 2. 사용자로부터 수를 입력받아 입력받은 수까지의 합 구하기 1~입력받은수까지
		/*
		Scanner sc = new Scanner(System.in); //입력할 수 있도록
		System.out.println("수를 입력하시오.");
		int num=sc.nextInt(); //입력받아서 num에 저장
		int sum=0;
		
		for(int i=0;i<=num;i++) {
			sum=sum+i;
			System.out.println(i);
		}
		
		System.out.println("총합:"+sum);
		*/
		
		int su; //입력변수
		int sum=0; //출력변수
		Scanner sc = new Scanner(System.in);
		su = sc.nextInt(); //수입력받았다.
		
		for(int i=1;i<su;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
