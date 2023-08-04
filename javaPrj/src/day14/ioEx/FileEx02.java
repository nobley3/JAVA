package day14.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileEx02 {

	public static void main(String[] args) {

		
		try {
//			데이터가 들어오는 길(통로)을 얻어온 것!!
			FileInputStream fis = new FileInputStream("res/test.txt");
			/*
			int su;
			su=fis.read(); //읽어라
			System.out.println((char)su);
			
			su=fis.read();
			System.out.println((char)su);
			
			su=fis.read();
			System.out.println((char)su);
			*/
			
//			파일이 생성될 때 파일에 끝에 -1 (파일의 끝을 알리는 문자) 생성됨
			while(true) {
				int su;
				su=fis.read();
				if(su==-1)break;
				System.out.println((char)su);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
