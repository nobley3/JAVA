package day14.실습;
//1.우리반 친구들 이름이 있는 파일 읽어오기 그 중에 이름만 출력하기
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q_01 {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/Student.txt"));
			
			while(true) {
				String data = bf.readLine();
				if(data==null) {
					break;
				}
				String result=data.substring(1);
				System.out.println(result);
				
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
