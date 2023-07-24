package algoPrj.day2;

public class 이윤P_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=1;
		final int MAX=11;
		
		while(n<=MAX) {
			sum+=n;
			n+=2; //n=n+2;
		}
		System.out.println(sum);
	}

}
