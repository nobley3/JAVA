package algoPrj.day5;

public class Pct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1~10까지 합 구하기
		/*
		int sum=0;
		for(int i=0; i<=10;i++) {
			sum=sum+i;
			System.out.println(i);
		}
		System.out.println("총합:"+sum);
		*/
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
			
		}
		System.out.println(sum);
	}

}
