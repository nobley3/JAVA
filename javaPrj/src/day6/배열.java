package day6;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서 배열을 선언하는 방법 
				//int  arr[5];  이런 문법이 제공되지 않음 
				int[] kors = new int[5];
				int[] kors2 = {90,80,99,100,89};  // 배열의 초기화블럭 
				
				 
				
				int a=10, b=5, c=8,d=9,e=25;
				int sum = a+b+c+d+e;
				System.out.println( sum);
				
			
				int[] arr= new int[5];		
				// arr=10;   X  , 배열명은 배열( 연속적인 기억장소의 시작점이다) 		
				arr[0]=10;
				arr[1]=5;
				arr[2]=8;
				arr[3]=9;
				arr[4]=25;
				
				int sum2 = arr[0] + arr[1] + arr[2] + arr[3]+ arr[4];	
				
				System.out.println( a);
				System.out.println( b);
				System.out.println( c);
				System.out.println( d);
				System.out.println( e);
				
				//배열의 첨자는 변수를 사용할 수 있다.
				//반복문을 사용할 수 있다.
				System.out.println( arr[0]);
				System.out.println( arr[1]);
				System.out.println( arr[2]);
				System.out.println( arr[3]);
				System.out.println( arr[4]);
				
				for( int i=0; i< arr.length ;i++) {
					System.out.println(  arr[i]);
				}
	}

}
