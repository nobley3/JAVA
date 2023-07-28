package day9.함수;

import java.util.Scanner;

public class 실습문제4 {
	
	static String[] gongcha =new String[5];
	static int index=0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//4.   3번을 함수로 만들어 보기 
		
		
		int menu;
		
		loop: while(true) {
			System.out.println("메뉴선택: 1.등록 2.조회 3.변경 4.삭제");
			
			String menu_ = sc.nextLine();
			menu=Integer.parseInt(menu_);
			
			switch(menu) {
			case 1:
				insertMenu();
				break;
			case 2:
				checkMenu();
				break;
			case 3:
				changeMenu();
				break;
			case 4:
				deleteMenu();
				break loop;
				
				default:
					System.out.println("잘못입력했습니다.");
					
			}
		}
				
	}
	public static void deleteMenu() {
		System.out.println("삭제");
		checkMenu();
		System.out.println("삭제하고 싶은 메뉴를 선택하세요");
		String deleteIndex_ = sc.nextLine();
		int deleteIndex = Integer.parseInt(deleteIndex_); //숫자로 바꿔주는 "25" ->25  
		gongcha[deleteIndex-1]="";
	}
	public static void changeMenu() {
		System.out.println("메뉴를 변경합니다");
		checkMenu();
		System.out.println("변경할 순번과 내용을 입력하세요");
		String updateIndex_ = sc.nextLine();
		int updateIndex=  Integer.parseInt(updateIndex_); //
		String updateMenu = sc.nextLine(); //한줄통째로 읽어온다.
		gongcha[updateIndex-1]=updateMenu;
	}
	public static void checkMenu() {
		System.out.println("메뉴를 조회합니다");
		for(int i=0;i<index;i++) {
			System.out.println((i+1)+"."+gongcha[i]);
		}
	}
	public static void insertMenu() {
		System.out.println("좋아하는 메뉴를 입력하세요");
		String name = sc.nextLine();
		gongcha[index]=name;
		index++;
	}

}
