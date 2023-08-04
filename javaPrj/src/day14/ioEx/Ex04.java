package day14.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) {

		
//		InputStreamReader ir = new InputStreamReader(System.in);
		
//		더 많은 문자 읽을 수 있음
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
//		String data = bs.readLine();
		try {
			String data = bs.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
