package algoPrj.day3;

public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//분기문 if, switch
		//if문 형식
		/*1.
		 * if(조건식){}
		 * */
		/*2.
		 * if(조건식){
		 * }else{
		 * }
		 * */
		/*3.
		 * if(조건식){
		 * }else if(조건식){
		 * }else{}
		 * */
		/*4.
		 * if(조건식){
		 * }else if(조건식){
		 * }
		 * */
		//////////////////////////////////
		//if문의 잘못된 예 (자주 실수하는)
		int score=90;
		if(score>=90) {
			System.out.println("학점은 A");
		}else if(score>=80) {
			System.out.println("학점은 B");
		}
		///////////////////////////////////
		//if문 사용시 주의사항 위의 코드와 아래코드는 다른 결과를 발생한다.
		if(score>=90) {
			System.out.println("학점은 A");
		}
		if(score>=80) {
			System.out.println("학점은 B");
		}
		///////////////////////////////////
	}

}
