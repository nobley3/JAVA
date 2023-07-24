package algoPrj.day3;

public class 별나오기반복문연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아래로 다섯개씩 점차적으로 커지기
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
