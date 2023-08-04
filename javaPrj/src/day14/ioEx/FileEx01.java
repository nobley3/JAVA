package day14.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) {
	 
		//기반스트림
//		두개 읽어옴
		try {
			FileInputStream fis = new FileInputStream("res/test.txt");
			int data1=fis.read();
			System.out.println( (char)data1);
			
			data1=fis.read();
			System.out.println((char)data1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
	}

}
