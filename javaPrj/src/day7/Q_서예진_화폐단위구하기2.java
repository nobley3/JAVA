package day7;

import java.util.Scanner;

public class Q_서예진_화폐단위구하기2 {

	public static void main(String[] args) {
		
		System.out.println("출장비 입력");
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		
		int money1 = money/50000;
		money=money-(50000*money1);
		//System.out.println(money); //15000
		//System.out.println(money1); //7
		
		int money2 = money/10000; //(/):정수/정수 => 정수 ex)10/3 => 3
		money= money-(10000*money2);
		//System.out.println(money);
		//System.out.println(money2);
		
		int money3 = money/5000;
		money= money-(5000*money3);
		
		int money4 = money/1000;
		money=money-(1000*money4);
		
		int money5 = money/500;
		money=money-(500*money5);
		
		int money6 = money/100;
		money=money-(100*money6);
		
		int money7 = money/50;
		money=money-(50*money7);
		 
		int money8 = money/10;
		money=money-(10*money8);
		
		System.out.println("50000=>"+money1+" 10000=>"+money2+" 5000=>"+money3+" 1000=>"+money4+" 500=>"+money5+" 100=>"+money6+" 50=>"+money7+" 10=>"+money8);
		
		
		
				
		

	}

}
