package day8.함수;

public class Q_7 {

	public static void main(String[] args) {
		//짝수(2~10), 홀수(1~9) 를 반환하는 함수 만들기
		
		int[][] num = evenodd();
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			
			System.out.println();
		}
	}

	public static int[][] evenodd() {
		int[][]num= {{2,4,6,8,10},{1,3,5,7,9,}};
		return num;
	}

}
