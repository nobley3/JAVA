package day14.ExceptionEx;

import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
//		예외가 발생했을 때 프로그래머가 해야하는 것은 대비코드를 작성하는 것!
		
		try {
			int a = System.in.read(); //한바이트만 읽어옴(아스키코드값을 읽어옴)
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.exit(0);  //종료하는 코드
//			e.getMessage(); 
//			e.printStackTrace();
			System.out.println(" 예외사항 알림!");
		} 
	}

}
