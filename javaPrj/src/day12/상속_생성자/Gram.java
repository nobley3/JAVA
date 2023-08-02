package day12.상속_생성자;

public class Gram extends Notebook {
	String name;
	String gpu;
	
//	생성자를 하나라도 만들면 기본생성자는 제공되지 않는다.
	
//	매개변수 생성자
	public Gram(String cpu, int ram, String name, String gpu) {
		super(cpu, ram ); //부모의 매개변수가 있는 생성자를 호출하는 코드
//							명시적으로 부모의 생성자를 호출하는 코드가 없으면
//							부모의 기본생성자 super();를 호출한다.!!
		
//		this.cpu = cpu;
//		this.ram = ram;
		this.name = name;
		this.gpu = gpu;
	}
	
	public String toString() {
		return name + cpu + ram + gpu;
	}
}
