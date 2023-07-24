package algoPrj.day4;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch, while, for 반복문에서 break; 
		//자신이 속한 반복문 빠져나옴
		
		//1~10까지의 합 break이용하여 구해보기.
		
		int i=0;
		int sum=0;
		while(true) { // true : 무한루프 , 반드시 탈출조건을 줘야한다.
			i++;
			sum+=i;
			if(i>=10)break;
		}
		System.out.println("합:"+sum);
	}

}
