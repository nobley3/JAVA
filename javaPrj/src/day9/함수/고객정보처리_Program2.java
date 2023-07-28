package day9.함수;
import java.util.ArrayList; 
import java.util.Scanner;
public class 고객정보처리_Program2 {

	public static void main(String[] args) {
		//4명의 고객을 입력받아 저장한 후 출력하는 프로그램
		ArrayList<고객정보처리_Customerclass> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String id;
		String pw;
		String name; 
		String addr;
		
		for(int i=0;i<4; i++) {
			System.out.print("아이디");id= sc.next();
			System.out.print("비번");pw = sc.next();
			System.out.print("이름");name= sc.next();
			System.out.print("주소");addr = sc.next();
			고객정보처리_Customerclass s = new 고객정보처리_Customerclass( id, pw, name, addr);
			list.add(s);
			// 위의 두줄을 아래의 한 줄로 작성해도 됨
			//list.add(new Customer( id, pw, name, addr));
			}
			//고객목록 출력
			for(int i=0; i< list.size(); i++) {
			System.out.println( list.get(i).toString());
			// System.out.println( list.get(i) ); toString()매서드 생략 가능함 
			}
	}

}
