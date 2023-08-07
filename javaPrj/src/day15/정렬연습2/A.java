package day15.정렬연습2;

public class A implements MyComparatorYY2{

	@Override
	public int compare(Object o1, Object o2) {
		
		Score s1 = (Score)o1;
		Score s2 = (Score)o2;
		
		return s1.getKor()-s2.getKor();
	}

	
}
