package day13StringEx;

public class Ex02 {

	public static void main(String[] args) {

		String str = new String("hello");
//		문자열 (속성 (char[])+기능(매서드->함수)
//		문자열 수정이 불가
		char result = str.charAt(0); //특정문자 뽑아오는 기능
		System.out.println(result);
		
//		str 문자열 객체의(원본)내용은 바꿀 수 없다.
//		원본의 문자열이 수정되는 것은 아니다.
		
		String result2 = str.replace('e', 'a'); //e를 a로 바꾸는 //새로운 문자열을 반환함 
		System.out.println(result2);
		System.out.println("원본은 수정되지 않았음="+str);
		
		String result3 = str.toUpperCase(); //대문자로 변경
		System.out.println(result3);
		
		String date = new String("2023-08-03"); //문자열분리
		String[] result4 = date.split("-");
		for(int i=0;i<result4.length;i++) {
			System.out.println(result4[i]);
		}
		
//		오버로딩, 매서드 이름이 같다. 식별은 매개변수의 차이로 식별한다.
											//시작인덱스(인덱스는 0부터)
		String result5 = date.substring(5); //5번째부터 끝까지 
		System.out.println(result5);
											  //시작인덱스, 끝인덱스 전 까지
		String result6 = date.substring(5, 7);//5 번째 부터 7 전까지
		System.out.println(result6);
		
		System.out.println("문자열의길이="+date.length());
		
//		문자열의 비교는 equals()매서드를 사용해야 한다.
		String s1="hello";
		String s2="hello";
		boolean result7 = s1.equals(s2);
		System.out.println(result7);
		
	}

}
