package day12.상속_생성자;

public class Animal {
	
	
	String name;
	String fname;
	
	
	
	public Animal() {
		this("동물이름","별명");  //매개변수 있는 생성자 호출코드 /필요없으면 안적어도 됨.
		
		
	}
	
	public Animal(String name, String fname) {
		this.fname=fname;
		this.name=name;
	}
	
	
	

}
