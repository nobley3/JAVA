package day8.함수;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		//자신이 만든 화폐구하기를 함수 만들기
		int money=752560; 
		each(money);

}

	public static void each(int money) {
		int[] unit = {50000,10000,5000,1000,500,100,50,10};
		int[] moneys= new int[8];
		
		
		for( int i=0; i<8; i++) {		   
			moneys[i] = money/unit[i];      
			money= money-(unit[i]*moneys[i]);
	}
		for( int i=0; i< moneys.length; i++) {
			System.out.println(unit[i]+"=>"+ moneys[i]+" " );
		}
	}
}