package algoPrj.day2;

public class 박지원S_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; //항의 누적을 구할 변수
		int n=0;   //반복제어변수, 항의순번
		int a=2;   //항을 구할변수
		int b=3;   //공비
		
		while(n<7) {
			sum=sum+a; //sum+=a;
			a=a*b;
			n++;
		}
		System.out.println(sum);
	}

}
