package algoPrj.day5;

public class ContinueEx {

	public static void main(String[] args) {
		//continue 명령 : 반복문에서 다음 반복으로 바로 진행될 수 있도록 하는 명령. //해당 반복부분만 탈출하고 다음번 반복을 이어서한다.
		//1~10까지 홀수합구하기
		//1,3,5,7,9
		
		int sum=0; // 홀수합을 저장할 변수
		for(int i=1;i<=10;i++) {
			if(i%2==0){//i가 짝수이면
				continue;
			}
			sum+=i;
			System.out.println(i);
		}
		//1          0
		//i   i%2   sum
		//1    1     1
		//2    0     1
		//3    1     4
		//4    2     4
		//5    1     9
		//6    0     9
		
		System.out.println("홀수의 합:"+sum);
	}

}
