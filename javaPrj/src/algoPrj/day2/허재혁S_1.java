package algoPrj.day2;

public class 허재혁S_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=1999;
		double h=2500000;
		double k=1800000;
		double a; //h시의 증가분
		double b; //k시의 증가분
		
		while(h>k) {
			year++;
			a=h*0.036;
			b=k*0.042;
			//각 h시와 k시의 인구수 갱신
			h=h+a;
			k=k+b;
		}
		System.out.println(year);
	}

}
