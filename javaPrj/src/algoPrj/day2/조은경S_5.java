package algoPrj.day2;

public class 조은경S_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=2;
		int i=1;
		
		System.out.print(n+" ,");
		while(i<7) {
			sum +=n; //항의 누적
			n=n*3; //n*=3
			System.out.print(n+" ,");
			i++; // i=i+1;
		}
		System.out.println("\n sum="+sum);
	}

}
