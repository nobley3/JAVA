package day9.함수;

public class 고객정보처리_Customerclass {
	//멤버변수
	private String id;
	private String pw;
	private String name;
	private String address;
	
	//생성자
	public 고객정보처리_Customerclass(String id,String pw, String name, String address) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.address=address;
	}
	public String toString() {
		return "고객정보처리_Customerclass[id="+id+",pw="+pw+",name="+name+",address="+address+"]";
	}
	
}
