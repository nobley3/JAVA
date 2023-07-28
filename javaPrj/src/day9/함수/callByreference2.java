package day9.함수;

public class callByreference2 {
	
	public static void main(String[] args) {

		//
		int[]kors=new int[3];
		
		//등록
		reGister(kors);
		
		//조회
		cheCk(kors);
		
	}
	

	public static void cheCk(int[] kors) {
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
	}

	public static void reGister(int[] kors) {
		kors[0]=5;
		kors[1]=8;
		kors[2]=9;
	}
	
}
