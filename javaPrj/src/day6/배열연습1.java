package day6;

public class 배열연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//내가 좋아하는 것 5개 배열로 만들고 출력하시오
		
		//자바 문자표현 : char : 2byte,한글 한자 표현 가능함
		//char[] arr= new char[5]; : 문자 5개 ''
		//한 문자 표현함 '가','나';
		//문자열은 char[]로 표현됨
		//자바는 문자열을 사용할 수 있는 String 클래스 제공함
		
		//char[] arr= new char[5]; : 문자 5개 ''
		//double[] arr2=new double[5];
		//String[]arr3=new String[5]; ""
		//int[]arr4=new int[5];
		
		//배열은 기억단계와 처리단계가 다를 때 반드시 필요함.
		String[]arr= new String[5];
		arr[0]="블랙밀크티";
		arr[1]="자몽그린티";
		arr[2]="망고요구르트";
		arr[3]="우롱밀크티";
		arr[4]="타로밀크티";
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
