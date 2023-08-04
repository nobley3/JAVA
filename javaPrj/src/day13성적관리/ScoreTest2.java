package day13성적관리;

import java.util.ArrayList;

public class ScoreTest2 {

	public static void main(String[] args) {

//		객체배열
		ArrayList list = new ArrayList();
		
//		학생등록하기
		Score s = new Score("박태민",100,99);
		Score s2 = new Score("박지원",100,100);
		

		
		list.add(s);
		list.add(s2);
		list.add(new Score("김민지",99,100)); //한명더 추가할때 이런방법도 있음
		
		
//		삭제하기
		System.out.println("학생정보삭제하기");
		int index=1;
		list.remove(index-1);//첫번째
		
//		조회하기
		System.out.println("조회합니다");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); //list.get :꺼내오기
		}
//		Object 안에 toString() 있다
//		Score -> toString()재정의 했다 : 오버라이드
		
		Object obj =new Score("홍길동",100,80); //업캐스팅ok
		System.out.println(obj);
//		부모형으로 참조해도 오버라이드된 실제 객체의 매서드가 호출된다.
		
//		김민지 학생의 정보를 조회하기
		System.out.println("김민지학생조회");
		String searchName="김민지";
		for(int i=0;i<list.size();i++) {
//			if(list.get(i))
			Object o = list.get(i);
			String name =((Score)o).getName(); // 이름받아온거
			
			if(name.equals(searchName)) { //true, false
			
				System.out.println(o);//toString 생략
			}
		}
		
//		박지원 학생의 정보 변경하기
//		국어성적 => 99으로 변경
		System.out.println("박지원국어점수변경");
		for(int i=0;i<list.size();i++) {
			Score score = (Score)list.get(i); //꺼내오기, 다운캐스팅
			
			if(score.getName().equals("박지원")) {
				score.setKor(99);//국어점수 변경
			}
		}
		System.out.println("조회하기");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); //list.get :꺼내오기
		}
		
	}

}
