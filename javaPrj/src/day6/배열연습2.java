package day6;

public class 배열연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2차원 배열 연습
		String[]moviestars= {"박서준","한소희","송강호","이정재"};
		String[]movies= {"엘리멘탈","인어공주","인사이드아웃","아나스타샤"};
		
		String[][]arr= {
				{"박서준","한소희","송강호","이정재"},
				{"엘리멘탈","인어공주","인사이드아웃","아나스타샤"}
				};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
			//+System.lineSeparator() 줄바꿈
		}
		
		
				
		
		
	}

}
