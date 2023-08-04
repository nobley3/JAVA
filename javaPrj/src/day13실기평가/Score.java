package day13실기평가;
//문제9
public class Score {

	String name;
	int kor;
	int eng;
	char grade;
	
	
	public Score(String name, int kor, int eng) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calcGrade();
	}
	
	public void calcGrade() {
		int sum=kor+eng;
		double avg=sum/2.0;
		if(avg>=90) {
			grade ='A';
		}else if(avg>=80) {
			grade ='B';
		}else if(avg>=70) {
			grade ='C';
		}else {
			grade ='F';
		}
		
	}
	@Override
	public String toString() {
		return name+" "+kor+" "+eng+" "+grade;
	}
	
}
