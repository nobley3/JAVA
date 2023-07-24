package algoPrj.day4;

import java.util.Scanner;

public class Pct3 {

	public static void main(String[] args) {
		//3. 고객정보(아이디, 이름,  나이 ,키 )입력받아서 출력하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("고객정보를 입력하시오.(1.아이디 2.이름 3.나이 4키)");
		
		String id = sc.next();
		String name = sc.next();
		int age = sc.nextInt();
		int height = sc.nextInt();
		
		System.out.println("아이디:"+id+"\n이름:"+name+"\n나이:"+age+"\n키:"+height); //\n: 줄바꿈
		*/
		
		String id;
		String name;
		int age;
		double height;
		
		Scanner sc= new Scanner(System.in);
		id = sc.next();
		name=sc.next();
		age=sc.nextInt();
		height=sc.nextDouble();
		
		System.out.println(id+name+" "+age+" "+height);
		
	}

}
