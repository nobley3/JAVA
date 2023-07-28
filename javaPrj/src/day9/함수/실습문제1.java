package day9.함수;

import java.util.Scanner;

public class 실습문제1 {
	
	public static void main(String[] args) {
		//2.     1번을  함수로 만들어 보기
		
		String[] gongcha =new String[5];
		Scanner sc = new Scanner(System.in);
		
		int menu;
		int index=0;
		
		while(true) {
			System.out.println("메뉴선택: 1.등록 2.조회");
			
			String menu_ = sc.next();
			menu=Integer.parseInt(menu_);
			
			switch(menu) {
			case 1:
				System.out.println("좋아하는 메뉴를 입력하세요");
				String name = sc.next();
				gongcha[index]=name;
				index++;
				break;
			case 2:
				System.out.println("메뉴를 조회합니다");
				for(int i=0;i<index;i++) {
					System.out.println((i+1)+"."+gongcha[i]);
				}
				break;
				default:
					System.out.println("잘못입력했습니다.");
			}
		}
				
	}

}
