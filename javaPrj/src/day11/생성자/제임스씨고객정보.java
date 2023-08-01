package day11.생성자;

public class 제임스씨고객정보 {

	private String name;
	private int age;
	private int ch;
	private boolean isMarried = true;
	
	public 제임스씨고객정보() {
		
	}
	
	public 제임스씨고객정보 (String name, int age, int ch, boolean isMarried) {
		this.name=name;
		if(age>0) {
			this.age=age;
		} 
		this.ch=ch;
		this.isMarried=isMarried;
	}
	
	public String toString(){
		return "이름:"+name+"\n"+"나이:"+age+"\n"+"자녀수:"+ch+"\n"+"결혼유무:"+isMarried+"";
	}
}
