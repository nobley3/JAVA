package day13실기평가;

//문제10

public class ScoreTest {

	public static void main(String[] args) {

		Score SS = new Score("이학생", 90, 90);
		Score SS2 = new Score("김학생", 80, 82);
		Score SS3 = new Score("전학생", 60, 70);
		
		String result = SS.toString();
		String result2 = SS2.toString();
		String result3 = SS3.toString();
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	
	}

}
