package day7.함수;

public class Ex08 {

	public static void main(String[] args) {
			
		int result =a(5);
		System.out.println(result);
		
		int resultb =b('z');
		System.out.println(resultb);
		
		char resultc =c(5);
		System.out.println(resultc);
		
		double resultd =d();
		System.out.println(resultd);
		
		String resulte =e();
		System.out.println(resulte);
		
	}
	
    //반환타입    //입력정보
		public static int  a( int a ) {
		System.out.println("a 호출");
		return 3;
		}
		
		
		public static int b(char a){
		System.out.println("b 호출");
		return 4;
		}
		
		
		public static char c( int a){
		System.out.println("c 호출");
		return 'c';
		}
		
		
		public static double d( ){
		System.out.println("d 호출");
		return 2.5;
		}
		
		
		public static String e(){
		System.out.println("e 호출");
		return "안녕" ;
}
}
