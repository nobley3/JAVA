package day10.classType;

public class 자판기프로그램_객체지향 { 
	
	
	public static void main(String[] args) {		 
		//변수의 지역성
		//함수안에서 만든 변수는 그 함수안에서만 사용가능하다.
		커피데이터2 coffee =null;
		coffee = new  커피데이터2();
		
		//printInfo(coffee);
		coffee.printinfo();
		
		//fillCoffee(coffee);
		coffee.fillcoffee();		
		  		
		int money=100;		
		//String result  =밀크커피만들기( coffee, money);
		String result = coffee.밀크커피만들기(money);
		System.out.println( result);
		

	}

 
 
	
	 
}
