package day14.ioEx;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {

		
		try {
			int su = System.in.read(); //한바이트로 읽어옴 그럼 한글은..?
			System.out.println(su);
			su=System.in.read();
			System.out.println(su);
//			keycode 읽어온다
//			'0' -> 48
//			'1' -> 49
//			'a' -> 97 (32)를 빼거나 더하면 대문자 소문자 나온다.
//			'A' -> 65
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
