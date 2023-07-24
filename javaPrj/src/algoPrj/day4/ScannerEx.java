package algoPrj.day4;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		
		System.out.print(name+" "+"국어:"+kor+"영어:"+eng+"수학:"+ math+"총합:"+sum+"평균:"+avg+" ");
		
	}

}
