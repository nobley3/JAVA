package day7;

public class 화폐구하기_T_ver {

	public static void main(String[] args) {
		
		int money=312500;
		int[] moneys = new int[8]; //고액권부터 화폐매수 저장
		int[] unit = {50000,10000,5000,1000,500,100,50,10};
		
		for(int i=0;i<8;i++) {
			moneys[i]=money/unit[i];
		}

	}

}
