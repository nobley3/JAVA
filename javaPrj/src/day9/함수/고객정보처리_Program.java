package day9.함수;
import java.util.ArrayList;
public class 고객정보처리_Program {

	public static void main(String[] args) {
		
		//고객정보를 저장한다, 생성자 이용
		고객정보처리_Customerclass customer = new 고객정보처리_Customerclass("monster","123","김고객","부산");
		//고객정보 출력
		System.out.println(customer.toString());
		
		//고객여러명
		ArrayList<고객정보처리_Customerclass> list = new ArrayList<>();
		list.add( new 고객정보처리_Customerclass("m1" ,"123" ,"김고객" , "부산"));
		list.add( new 고객정보처리_Customerclass("m2" ,"123" ,"이고객" , "마산"));
		list.add( new 고객정보처리_Customerclass("m3" ,"123" ,"박고객" , "서울"));
		list.add( new 고객정보처리_Customerclass("m4" ,"123" ,"최고객" , "경기"));
		
		//고객목록 출력
		for(int i=0; i< list.size(); i++) {
		System.out.println( list.get(i).toString());
		// System.out.println( list.get(i) ); toString()매서드 생략
		}
	}

}
