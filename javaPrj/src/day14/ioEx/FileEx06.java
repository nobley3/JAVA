package day14.ioEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx06 {

	public static void main(String[] args) {

		
		try {
//			기반스트림 얻어오기
//			파일
			FileWriter w = new FileWriter("res/output.txt");
			w.write("안녕하세요");
			w.flush();//내보내는 행위
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
