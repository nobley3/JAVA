package day13ObjectEx;

public class B {

	int number;
	
	public B() { //기본생성자
		
	}
	
	public B(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		
		return number+"입니다";
	}
	@Override   //비교대상
//	public boolean equals(B this,Object obj) {//오버라이드는 부모를 고칠 수 없음
	public boolean equals(Object obj) {
		boolean result = false;
		B b =(B)obj; //다운캐스팅
		if(this.number==b.number) {
			
			result = true;
		}
		return result;
	}
}
