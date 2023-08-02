package day12다형성예제_Object;

import java.util.ArrayList;

public class 다형성연습 {

	public static void main(String[] args) {

//		Car, Cat, Person : 참조형변수
//		우리가 상속을 하나라도 받지만 기본적으로 Object를 상속받는다.
//		모든 객체는 Object로 다뤄질 수 있다.
		Car c = new Car();
		Cat cat= new Cat();
		Person p = new Person();
		Wolf w = new Wolf();
		
//		참조형변수 4개를 배열로 만든 것.
		Object[]arr = new Object[4];
		arr[0] = c;
		arr[1] = cat;
		arr[2] = p;
		arr[3] = w;
		
//		반복문
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].toString());
		}
//		가변길이배열,순서,중복허용
		ArrayList list = new ArrayList(); //담고 싶은거 있으면 담아 
		list.add(c);
		list.add(cat);
		list.add(p);
		list.add(w);
		
		for(Object o : list) {
			System.out.println(o.toString());
			
			if(o instanceof Cat) {
				((Cat)o).쥐를잡는다();
			}
		}
		
		String str = "I like java";
		char result = str.charAt(0);
		boolean result2 = str.equals("I like java");
		
		Object obj = str; //업캐스팅
		
		String str1 = "one";
		String str2 = "two";
		String str3 = "three";
		
		ArrayList strList = new ArrayList<>();
		strList.add(str1);
		strList.add(str2);
		strList.add(str3);
		
		for(int i=0;i<strList.size();i++) {
			Object o = strList.get(i);
			System.out.println(o); //원래의 값
			
			if(o instanceof String) {
				
				((String)o).toUpperCase();{
					String rtn = ((String)o).toUpperCase();
					System.out.println(rtn); //대문자로 바꾼 값
				}
			}
		}
		
	}

}
