package algoPrj.day2;

public class 곽단야P_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		int sum=0; //누적합
		//처리
		int jsum=0;
		int i=1; //반복제어변수
		int j=i-1; //j=0
		
		final int MAX=5;
		
		//1 +(1+2)+(1+2+3)+(1+2+3+4)...
		
		while(i<=MAX) {
			j=i-1;
			jsum=jsum+j;//jsum+=j; 
			sum=sum+(jsum+i);
			i++;
		}
		System.out.println(sum);
	}

}
