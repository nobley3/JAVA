package day6.arry3;

public class Array3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]even= {
				{2,4,6},
				{8,10,12},
				{14,16,18}
		}; 
								
		int[][]odd = {
				{1,3,5},
				{7,9,11},
				{13,15,17}
		};
		//면 행 열
		int[][][]numbers = {
				{
					{2,4,6},
					{8,10,12},
					{14,16,18}
				},
				{
					{1,3,5},
					{7,9,11},
					{13,15,17}
				},
				{
					{11,22,33},
					{44,55,66},
					{77,88,99}
					
				}
		};
		// 10, 15 출력
		
		System.out.println(numbers[0][1][1]);
		System.out.println(numbers[1][2][1]);
		
		//55, 99 출력
		System.out.println(numbers[2][1][1]);
		System.out.println(numbers[2][2][2]);
	}

}
