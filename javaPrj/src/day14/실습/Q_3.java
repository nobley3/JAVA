package day14.실습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//3.  파일에 국어점수를 10개 넣고 총점과 평균구하기
public class Q_3 {

	public static void main(String[] args) {

		try {
			BufferedReader BF = new BufferedReader(new FileReader("res/kor.txt"));
			
			int sum=0;
			double avg;
			int count=0;
			
			while(true) {
				String data = BF.readLine();
				count++;
				if(data==null)break;
				System.out.println(data);
				int dataNumber = Integer.parseInt(data);
				sum+=dataNumber;
			}
			avg=sum/count;
			System.out.println("총합:"+sum);
			System.out.println("평균:"+avg);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
