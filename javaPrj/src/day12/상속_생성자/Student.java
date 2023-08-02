package day12.상속_생성자;

public class Student extends Person {

	int classNo;
	
	public Student(String name, String id, int classNo) {
//		값의 초기화 담당
//		super 키워드 : 상속관계 / 부모꺼
//		super();-> 기본적으로 부모의 기본생성자를 호출합니다.
		
		super(name,id); 
		this.classNo=classNo;
	}
	
	public String toString() {
		return name+id+classNo ;
	}
	
//	1.Student 매개변수가 있는 생성자가 call
//	2.자식의 생성자에서는 기본적으로 부모의 기본생성자를 호출합니다.
//	(상속관계에서 부모가 기본생성자가 필요하다)
}
