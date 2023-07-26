package day7;

import java.util.Scanner;

public class 화폐단위구하기 {

	public static void main(String[] args) {
		int[] money = {50000,10000,5000,1000,500,100,50,10};
		int [] arr = new int[8];
		Scanner sc = new Scanner(System.in);
		int rem = sc.nextInt(); // 돈받아옴
		
		for(int i=0;i<money.length;i++) {
			arr[i]=rem/money[i]; 
			rem=rem%money[i]; //
		}
		for(int i=0;i<money.length;i++) {
			System.out.println(money[i]+"=>"+arr[i]);
		}
	}

}
