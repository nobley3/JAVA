package day16;

public class 배열1차원을2차원으로사용하기 {

	public static void main(String[] args) {
		String[] map = new String[100];    //  1차원 배열로 만들고  2차원처럼 사용하기
		
	 
		for(int  i=0;i<10;i++) {			
			for(int j=0;j<10;j++) {
				 map[i*10+j] ="[ ]";				 
			} 
		}
		
		
		
		//배열 출력
		for(int  i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				System.out.print( map[i*10+j] );
			 
			} 
			
			System.out.println();
		}
		
		

	}

}
