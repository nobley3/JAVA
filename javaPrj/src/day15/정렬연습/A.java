package day15.정렬연습;

public class A implements MyComparatorYY {

	@Override
	public int compare(Object o1, Object o2) {
		
		Score s1 = (Score)o1;
		Score s2 = (Score)o2;
		
		
		return s1.getEng()-s2.getEng();  // 100-90  ///라이브러리를 만든 쪽에서 양수가 반환되면 두 객체의 교환이 일어남 
	}

}
