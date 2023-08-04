package day14.ioEx;

import java.io.IOException;

public class 키보드연속 {

	public static void main(String[] args) {

		
		while(true) {
//			int data = System.in.read();
			try {
				int data = System.in.read();
				System.out.print((char)data);	//문자타입으로
				if(data=='\n')break; 			//'\n':엔터 / 엔터를 누르면 멈춰라.
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
