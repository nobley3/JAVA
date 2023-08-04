package day14.실습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//2.  내가 좋아하는거 파일에서 읽어오기 ( 예시 : 좋아하는 과일이름 5개)
public class Q_02 {

	public static void main(String[] args) {

		try {
			BufferedReader BB = new BufferedReader(new FileReader("res/fruit.txt"));
			while(true) {
				String data = BB.readLine();
				if(data==null) {
					break;
				}
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
