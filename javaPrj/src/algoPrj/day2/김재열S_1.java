package algoPrj.day2;

public class 김재열S_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hp=2500000;
		double kp=1800000;
		double hr=0.036;
		double kr=0.042;
		int y=1999;
		
		while(true) {
			y++; //y=y+1;
			hp=hp*(1+hr);
			kp=kp*(1+kr);
			
			if(kp>hp) break;
		}
		System.out.println(y);
	}

}
