package algoPrj.day4;

import java.util.Scanner;

public class Pct4해설 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in) ;
		
		String day="기본일정입니다";
		int menu;
		
		
		System.out.print("메뉴선택");
		menu = sc.nextInt();			
		
		switch( menu) {
		case 1:
			System.out.println( "일정등록");
			day= sc.next();
			break;
		case 2:
			System.out.println(day);
			break;
		case 3:
			day=sc.next();
			break;
		case 4 :
			day="";
			break;
		case 5:
			System.out.println(" 종료합니다");
			break;
		default :
			System.out.println( " 잘못된 입력");
			
		} 
		

	}
	}


